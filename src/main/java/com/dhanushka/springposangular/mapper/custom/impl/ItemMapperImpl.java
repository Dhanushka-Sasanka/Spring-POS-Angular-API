/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.mapper.custom.impl;

import com.dhanushka.springposangular.dto.ItemDTO;
import com.dhanushka.springposangular.entity.ItemEntity;
import com.dhanushka.springposangular.entity.OrderDetailEntity;
import com.dhanushka.springposangular.mapper.custom.ItemMapper;

import java.util.ArrayList;
import java.util.List;

public class ItemMapperImpl implements ItemMapper {
    @Override
    public ItemEntity getEntityFromMapper(ItemDTO dto) {
        List<OrderDetailEntity> orderDetailEntity = new ArrayList<>();
        return new ItemEntity(dto.getItemcode(), dto.getItemdescription(), dto.getQuantity(),
                dto.getUnitprice(), orderDetailEntity);
    }

    @Override
    public ItemDTO getDTOFromMapper(ItemEntity entity) {
       return new ItemDTO(entity.getItemcode(),entity.getItemdescription(),entity.getQunatity(),entity.getUnitprice());
    }
}
