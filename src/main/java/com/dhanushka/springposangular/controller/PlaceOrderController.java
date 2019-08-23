/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.controller;

import com.dhanushka.springposangular.dto.PlaceOrderDTO;
import com.dhanushka.springposangular.service.custom.CustomerService;
import com.dhanushka.springposangular.service.custom.ItemService;
import com.dhanushka.springposangular.service.custom.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/place_order")
public class PlaceOrderController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ItemService itemService;

    @Transactional
    @GetMapping(value = "/add")
    public ResponseEntity placeCustomerOrder(@RequestBody PlaceOrderDTO placeOrderDTO) {

        return ResponseEntity.status(HttpStatus.OK).body("Place Order success..!");

    }



}
