/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.service.custom.impl;

import com.dhanushka.springposangular.dto.CustomerDTO;
import com.dhanushka.springposangular.entity.CustomerEntity;
import com.dhanushka.springposangular.repository.CustomerRepo;
import com.dhanushka.springposangular.service.custom.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public CustomerDTO addCustomer(CustomerDTO customerDTO) {
        return null;
    }

    public CustomerDTO updateCustomer(String id, CustomerDTO customerDTO) {
        return null;
    }

    public CustomerDTO deleteCustomer(String id) {
        return null;
    }

    public CustomerDTO searchCustomer(String id) {
        return null;
    }

    public List<CustomerDTO> getAllCustomers() {
        List<CustomerEntity> customerList = customerRepo.findAll();
        System.out.println("customerList = " + customerList);
        ArrayList<CustomerDTO> dto = new ArrayList<>();
        for (CustomerEntity cus : customerList) {

            dto.add(new CustomerDTO(cus.getCustomerId(),
                    cus.getCustomerName(),
                    cus.getCustomerAddress(),
                    cus.getCustomerTele(),
                    cus.getCustomerEmail()
            ));
        }
        return dto;
    }
}
