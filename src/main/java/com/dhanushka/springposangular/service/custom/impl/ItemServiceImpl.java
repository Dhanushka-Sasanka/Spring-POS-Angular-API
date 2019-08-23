/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.service.custom.impl;

import com.dhanushka.springposangular.dto.ItemDTO;
import com.dhanushka.springposangular.entity.ItemEntity;
import com.dhanushka.springposangular.mapper.custom.ItemMapper;
import com.dhanushka.springposangular.mapper.custom.impl.ItemMapperImpl;
import com.dhanushka.springposangular.repository.ItemRepo;
import com.dhanushka.springposangular.service.custom.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepo itemRepo;

    private ItemMapper itemMapper;

    ItemServiceImpl() {
        itemMapper = new ItemMapperImpl();
    }


    @Override
    public ItemDTO saveService(ItemDTO ItemDTO) {

        //customerMapper.getEntityFromMapper(ItemDTO)
        ItemEntity savedItem = itemRepo.save(itemMapper.getEntityFromMapper(ItemDTO));
        return itemMapper.getDTOFromMapper(savedItem);
//        if(saveCustomer.getCustomerEmail().equalsIgnoreCase(ItemDTO.getCustomerEmail())){
//        }

    }

    @Override
    public ItemDTO updateService(ItemDTO ItemDTO) {
//        in JPARepository we can use save(); as a update method
        ItemEntity updatedItem = itemRepo.save(itemMapper.getEntityFromMapper(ItemDTO));
        return itemMapper.getDTOFromMapper(updatedItem);

    }

    @Override
    public void deleteService(String id) {
        itemRepo.deleteById(id);

    }

    @Override
    public ItemDTO findByIdService(String id) {
        ItemEntity itemEntity = itemRepo.findById(id).orElseThrow(null);
        return itemMapper.getDTOFromMapper(itemEntity);
    }

    @Override
    public List<ItemDTO> findAllService() {
        List<ItemEntity> itemList = itemRepo.findAll();
        System.out.println("ItemList = " + itemList);
        ArrayList<ItemDTO> itemDTOList = new ArrayList<>();
        for (ItemEntity item : itemList) {
            ItemDTO dtoFromMapper = itemMapper.getDTOFromMapper(item);
            itemDTOList.add(dtoFromMapper);
        }
        return itemDTOList;
    }
}