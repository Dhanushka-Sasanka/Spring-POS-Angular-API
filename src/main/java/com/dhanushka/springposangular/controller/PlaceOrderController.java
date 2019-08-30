/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.controller;

import com.dhanushka.springposangular.dto.ItemDTO;
import com.dhanushka.springposangular.dto.OrderDTO;
import com.dhanushka.springposangular.dto.OrderDetailDTO;
import com.dhanushka.springposangular.dto.PlaceOrderDTO;
import com.dhanushka.springposangular.service.custom.ItemService;
import com.dhanushka.springposangular.service.custom.OrderDetailService;
import com.dhanushka.springposangular.service.custom.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/place_order")
public class PlaceOrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderDetailService orderDetailService;

    @Autowired
    private ItemService itemService;

    @Transactional
    @PostMapping(value = "/add")
    public ResponseEntity placeCustomerOrder(@RequestBody PlaceOrderDTO placeOrderDTO) { //PlaceOrderDTO placeOrderDTO
        System.out.println("placeOrderDTO = " + placeOrderDTO);

        List<OrderDetailDTO> orderDetailDTOList = placeOrderDTO.getOrderDetailDTOList();
        System.out.println("orderDetailDTOList = " + orderDetailDTOList);
        OrderDTO orderDTO = new OrderDTO(
                placeOrderDTO.getorderID(),
                placeOrderDTO.getCustomerId(),
                placeOrderDTO.getDate(),
                placeOrderDTO.getAmount());
        OrderDTO savedOrders = orderService.saveService(orderDTO);

        if (savedOrders != null) {
            System.out.println("IF ture");
            for (OrderDetailDTO detailDTO : orderDetailDTOList) {
                OrderDetailDTO orderDetialDTO = new OrderDetailDTO(
                        detailDTO.getItemCode(),
                        detailDTO.getOrderId(),
                        detailDTO.getQty(),
                        detailDTO.getUnitPrice());

                String itemCode = orderDetialDTO.getItemCode();
                ItemDTO itemDTO = itemService.findByIdService(itemCode);
                int qtyOnHand = itemDTO.getQuantity();
                int orderQty = detailDTO.getQty();
                int finalQty = qtyOnHand - orderQty;

                ItemDTO updateItemStock = new ItemDTO(
                        itemCode,
                        itemDTO.getItemdescription(),
                        finalQty,
                        itemDTO.getUnitprice());
                itemService.updateService(updateItemStock);
                orderDetailService.saveService(orderDetialDTO);

                System.out.println("orderDetialDTO = " + orderDetialDTO);
            }
        }
        System.out.println("IF false");
        return ResponseEntity.status(HttpStatus.OK).body("Order placed successful..!");

    }
}
