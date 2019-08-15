/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.service.custom;

import com.dhanushka.springposangular.dto.CustomerDTO;

import java.util.List;


public interface CustomerService {

    public CustomerDTO addCustomer(CustomerDTO customerDTO);

    public CustomerDTO updateCustomer(String id, CustomerDTO customerDTO);

    public CustomerDTO deleteCustomer(String id);

    public CustomerDTO searchCustomer(String id);

    public List<CustomerDTO> getAllCustomers();
}
