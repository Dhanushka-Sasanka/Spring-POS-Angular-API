/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.mapper.custom;

import com.dhanushka.springposangular.dto.CustomerDTO;
import com.dhanushka.springposangular.entity.CustomerEntity;
import com.dhanushka.springposangular.mapper.SuperMapper;

public interface CustomerMapper extends SuperMapper<CustomerEntity, CustomerDTO> {

    CustomerEntity  getEntityFromMapperWithImage(CustomerDTO dto);
//    CustomerDTO  getDTOFromMapperWithImage(CustomerEntity entity);
}
