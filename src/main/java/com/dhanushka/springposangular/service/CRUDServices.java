/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.service;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CRUDServices<T> {

    public T saveService(T t);

    public T  updateService(T t);

    public T  deleteService(String id);

    public T  findByIdService(String id);

    List<T> findAllService();
}
