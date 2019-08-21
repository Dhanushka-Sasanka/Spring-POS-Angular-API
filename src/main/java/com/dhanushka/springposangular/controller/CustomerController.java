/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.controller;

import com.dhanushka.springposangular.dto.CustomerDTO;
import com.dhanushka.springposangular.service.custom.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
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

    @PostMapping(value = "/add")
    public ResponseEntity saveCustomer(@RequestBody CustomerDTO customer){
        System.out.println("customer = " + customer);

        return new ResponseEntity(customerService.saveService(customer),HttpStatus.OK);
    }

}
