/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.service.custom.impl;

import com.dhanushka.springposangular.dto.OrderDTO;
import com.dhanushka.springposangular.entity.OrderEntity;
import com.dhanushka.springposangular.mapper.custom.OrderMapper;
import com.dhanushka.springposangular.mapper.custom.impl.OrderMapperImpl;
import com.dhanushka.springposangular.repository.OrderRepo;
import com.dhanushka.springposangular.service.custom.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;

    private OrderMapper orderMapper;

    public OrderServiceImpl() {
        orderMapper = new OrderMapperImpl();
    }

    @Override
    public OrderDTO saveService(OrderDTO orderDTO) {

        OrderEntity savedOrder = orderRepo.save(orderMapper.getEntityFromMapper(orderDTO));
        return orderMapper.getDTOFromMapper(savedOrder);
    }

    @Override
    public OrderDTO updateService(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public void deleteService(String id) {

    }

    @Override
    public OrderDTO findByIdService(String id) {
        return null;
    }

    @Override
    public List<OrderDTO> findAllService() {
        return null;
    }
}
