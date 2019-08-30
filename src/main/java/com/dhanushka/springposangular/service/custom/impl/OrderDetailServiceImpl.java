/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.service.custom.impl;

import com.dhanushka.springposangular.dto.OrderDetailDTO;
import com.dhanushka.springposangular.entity.OrderDetailEntity;
import com.dhanushka.springposangular.mapper.custom.impl.OrderDetailMapperImpl;
import com.dhanushka.springposangular.repository.OrderDetailRepo;
import com.dhanushka.springposangular.service.custom.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    private OrderDetailRepo orderDetailRepo;

    private OrderDetailMapperImpl orderDetailMapper;

    public OrderDetailServiceImpl() {
        orderDetailMapper = new OrderDetailMapperImpl();
    }


    @Override
    public OrderDetailDTO saveService(OrderDetailDTO orderDetailDTO) {
        OrderDetailEntity savedOrderDetail = orderDetailRepo.save(orderDetailMapper.getEntityFromMapper(orderDetailDTO));
        return orderDetailMapper.getDTOFromMapper(savedOrderDetail);
    }

//    public List<OrderDetailDTO> saveAllService(List<OrderDetailDTO>dtos){
//
//        orderDetailRepo.saveAll(orderDetailMapper.getEntityFromMapper(dtos));
//    }

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
