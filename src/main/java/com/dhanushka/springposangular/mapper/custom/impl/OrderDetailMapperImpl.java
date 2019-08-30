/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.mapper.custom.impl;

import com.dhanushka.springposangular.dto.OrderDetailDTO;
import com.dhanushka.springposangular.entity.ItemEntity;
import com.dhanushka.springposangular.entity.OrderDetailEntity;
import com.dhanushka.springposangular.entity.OrderEntity;
import com.dhanushka.springposangular.entity.Order_Detail_PK;
import com.dhanushka.springposangular.mapper.custom.OrderDetailMapper;

public class OrderDetailMapperImpl implements OrderDetailMapper {

    @Override
    public OrderDetailEntity getEntityFromMapper(OrderDetailDTO dto) {
        Order_Detail_PK order_detail_pk = new Order_Detail_PK();
        order_detail_pk.setOrderid(dto.getOrderId());
        order_detail_pk.setItemcode(dto.getItemCode());
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderid(dto.getOrderId());
        ItemEntity itemEntity = new ItemEntity();
        itemEntity.setItemcode(dto.getItemCode());
        return new OrderDetailEntity(order_detail_pk,dto.getQty(),dto.getUnitPrice(),orderEntity,itemEntity);
    }

    @Override
    public OrderDetailDTO getDTOFromMapper(OrderDetailEntity entity) {
        String itemCode = entity.getOrderDetails().getItemcode();
        String orderId = entity.getOrderDetails().getOrderid();
        return new OrderDetailDTO(itemCode,orderId,entity.getQty(),entity.getUnitPrice());
    }
}
