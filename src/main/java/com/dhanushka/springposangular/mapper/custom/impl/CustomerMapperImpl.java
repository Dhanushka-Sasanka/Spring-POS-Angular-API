/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.mapper.custom.impl;

import com.dhanushka.springposangular.dto.CustomerDTO;
import com.dhanushka.springposangular.entity.CustomerEntity;
import com.dhanushka.springposangular.mapper.custom.CustomerMapper;

public class CustomerMapperImpl implements CustomerMapper {


    @Override
    public CustomerEntity getEntityFromMapper(CustomerDTO dto) {

        return new CustomerEntity(
                dto.getCustomerId(),
                dto.getCustomerName(),
                dto.getCustomerAddress(),
                dto.getCustomerTele(),
                dto.getCustomerEmail(),
                dto.getByteImage());
    }

    @Override
    public CustomerDTO getDTOFromMapper(CustomerEntity entity) {
        return new CustomerDTO(
                entity.getCustomerId(),
                entity.getCustomerName(),
                entity.getCustomerAddress(),
                entity.getCustomerTele(),
                entity.getCustomerEmail(),
                entity.getCustomerImage());
    }


    @Override
    public CustomerEntity getEntityFromMapperWithImage(CustomerDTO dto) {
        return new CustomerEntity(
                dto.getCustomerId(),
                dto.getCustomerName(),
                dto.getCustomerAddress(),
                dto.getCustomerTele(),
                dto.getCustomerEmail(),
                dto.getCustomerImage().getBytes());
    }

//    @Override
//    public CustomerDTO getDTOFromMapperWithImage(CustomerEntity entity) {
//        return new CustomerDTO(
//                entity.getCustomerId(),
//                entity.getCustomerName(),
//                entity.getCustomerAddress(),
//                entity.getCustomerTele(),
//                entity.getCustomerEmail(),
//                entity.getCustomerImage());
//    }
}
