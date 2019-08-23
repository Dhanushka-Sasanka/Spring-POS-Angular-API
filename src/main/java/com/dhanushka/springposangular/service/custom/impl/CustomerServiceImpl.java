/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.service.custom.impl;

import com.dhanushka.springposangular.dto.CustomerDTO;
import com.dhanushka.springposangular.entity.CustomerEntity;
import com.dhanushka.springposangular.mapper.custom.CustomerMapper;
import com.dhanushka.springposangular.mapper.custom.impl.CustomerMapperImpl;
import com.dhanushka.springposangular.repository.CustomerRepo;
import com.dhanushka.springposangular.service.custom.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    private CustomerMapper customerMapper;

    CustomerServiceImpl(){
     customerMapper = new CustomerMapperImpl();
    }


    @Override
    public CustomerDTO saveService(CustomerDTO customerDTO) {

        //customerMapper.getEntityFromMapper(customerDTO)
        CustomerEntity customerEntity1 = customerRepo.save(customerMapper.getEntityFromMapperWithImage(customerDTO));
        return customerMapper.getDTOFromMapper(customerEntity1);
//        if(saveCustomer.getCustomerEmail().equalsIgnoreCase(customerDTO.getCustomerEmail())){
//        }
//
    }

    @Override
    public CustomerDTO updateService(CustomerDTO customerDTO) {
//        in JPARepository we can use save(); as a update method
        CustomerEntity customerEntity1 = customerRepo.save(customerMapper.getEntityFromMapperWithImage(customerDTO));
        return customerMapper.getDTOFromMapper(customerEntity1);

    }

    @Override
    public void deleteService(String id) {
        customerRepo.deleteById(id);

    }
    @Override
    public CustomerDTO findByIdService(String id) {

//        CustomerEntity customer = customerRepo.getOne(id);
        CustomerEntity customerEntity = customerRepo.findById(id).orElseThrow(null);
        return customerMapper.getDTOFromMapper(customerEntity);

    }

    @Override
    public List<CustomerDTO> findAllService() {
        List<CustomerEntity> customerList = customerRepo.findAll();
        System.out.println("customerList = " + customerList);
        ArrayList<CustomerDTO> customerDTOList = new ArrayList<>();
        for (CustomerEntity cus : customerList) {
            CustomerDTO dtoFromMapper = customerMapper.getDTOFromMapper(cus);
            customerDTOList.add(dtoFromMapper);
        }
        return customerDTOList;
    }
}

//            customerDTOList.add(new CustomerDTO(cus.getCustomerId(),
//                    cus.getCustomerName(),
//                    cus.getCustomerAddress(),
//                    cus.getCustomerTele(),
//                    cus.getCustomerEmail()
//            ));