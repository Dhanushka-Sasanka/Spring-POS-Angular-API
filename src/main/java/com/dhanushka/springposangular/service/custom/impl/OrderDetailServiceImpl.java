/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.service.custom.impl;

import com.dhanushka.springposangular.dto.OrderDetailDTO;
import com.dhanushka.springposangular.service.custom.OrderDetailService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    @Override
    public OrderDetailDTO saveService(OrderDetailDTO orderDetailDTO) {
        return null;
    }

    @Override
    public OrderDetailDTO updateService(OrderDetailDTO orderDetailDTO) {
        return null;
    }

    @Override
    public void deleteService(String id) {

    }

    @Override
    public OrderDetailDTO findByIdService(String id) {
        return null;
    }

    @Override
    public List<OrderDetailDTO> findAllService() {
        return null;
    }
}
