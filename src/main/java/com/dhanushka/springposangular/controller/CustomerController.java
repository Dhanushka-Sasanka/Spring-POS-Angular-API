/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.controller;

import com.dhanushka.springposangular.dto.CustomerDTO;
import com.dhanushka.springposangular.service.custom.CustomerService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Transactional
    @GetMapping(value = "/all")
    public ResponseEntity getAllCustomers() {
        List<CustomerDTO> allCustomers = customerService.findAllService();
        System.out.println("allCustomers = " + allCustomers);
        if (allCustomers.isEmpty()) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("No Customers");
        } else {
            return new ResponseEntity(allCustomers, HttpStatus.OK);
        }
    }

    @Transactional
    @PostMapping(value = "/add")
    public ResponseEntity saveCustomer(@RequestBody CustomerDTO customer) {
        System.out.println("customer = " + customer);
        return new ResponseEntity(customerService.saveService(customer), HttpStatus.OK);
    }

    @Transactional
    @GetMapping(value= "/search/{id}")
    public ResponseEntity getCustomerById(@PathVariable("id") String id ){
        System.out.println("id = " + id);
        return new ResponseEntity(customerService.findByIdService(id),HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping(value= "/delete/{id}")
    public ResponseEntity deleleCustomerById(@PathVariable("id") String id){
        System.out.println("id = " + id);
        customerService.deleteService(id);
//        return ResponseEntity.ok().body("Customer is deleted..!");
        return ResponseEntity.status(HttpStatus.OK).body("Customer is deleted..!");
    }

}
