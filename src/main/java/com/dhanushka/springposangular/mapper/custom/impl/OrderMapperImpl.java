/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.mapper.custom.impl;

import com.dhanushka.springposangular.dto.OrderDTO;
import com.dhanushka.springposangular.entity.CustomerEntity;
import com.dhanushka.springposangular.entity.OrderEntity;
import com.dhanushka.springposangular.mapper.custom.OrderMapper;

public class OrderMapperImpl implements OrderMapper {
    @Override
    public OrderEntity getEntityFromMapper(OrderDTO dto) {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setCustomerId(dto.getCustomerId());
        System.out.println("OrderMapperImpl.getEntityFromMapper");
        System.out.println("customerEntity = " + customerEntity);
        return new OrderEntity(dto.getOrderId(),dto.getDate(),dto.getAmount(),customerEntity);
//return null;
    }

    @Override
    public OrderDTO getDTOFromMapper(OrderEntity entity) {
        String customerId = entity.getCustomer().getCustomerId();
        return new OrderDTO(entity.getOrderid(),customerId,entity.getDate(),entity.getAmount());
    }
}
