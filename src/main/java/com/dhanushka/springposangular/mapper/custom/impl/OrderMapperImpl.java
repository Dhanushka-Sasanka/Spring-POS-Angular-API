/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.mapper.custom.impl;

import com.dhanushka.springposangular.dto.OrderDTO;
import com.dhanushka.springposangular.entity.OrderEntity;
import com.dhanushka.springposangular.mapper.custom.OrderMapper;

public class OrderMapperImpl implements OrderMapper {
    @Override
    public OrderEntity getEntityFromMapper(OrderDTO dto) {
        return null;
    }

    @Override
    public OrderDTO getDTOFromMapper(OrderEntity entity) {
        return null;
    }
}
