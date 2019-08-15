/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.mapper;

public interface SuperMapper<E ,D> {

    E getEntityFromMapper(D dto);

    D getDTOFromMapper(E entity);
}
