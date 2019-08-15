/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.service.custom.impl;

import com.dhanushka.springposangular.dto.OrderDTO;
import com.dhanushka.springposangular.service.custom.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderDTO saveService(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO updateService(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO deleteService(String id) {
        return null;
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
