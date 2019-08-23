/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.dto;

import java.util.Date;
import java.util.List;

public class PlaceOrderDTO {

    private String customerId;
    private String itemcode;
    private Date date;
    private List<OrderDetailDTO> orderDetailDTOList;

    public PlaceOrderDTO() {
    }

    public PlaceOrderDTO(String customerId, String itemcode, Date date, List<OrderDetailDTO> orderDetailDTOList) {
        this.customerId = customerId;
        this.itemcode = itemcode;
        this.date = date;
        this.orderDetailDTOList = orderDetailDTOList;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<OrderDetailDTO> getOrderDetailDTOList() {
        return orderDetailDTOList;
    }

    public void setOrderDetailDTOList(List<OrderDetailDTO> orderDetailDTOList) {
        this.orderDetailDTOList = orderDetailDTOList;
    }

    @Override
    public String toString() {
        return "PlaceOrderDTO{" +
                "customerId='" + customerId + '\'' +
                ", itemcode='" + itemcode + '\'' +
                ", date=" + date +
                ", orderDetailDTOList=" + orderDetailDTOList +
                '}';
    }
}
