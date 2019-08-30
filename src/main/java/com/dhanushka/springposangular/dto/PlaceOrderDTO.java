/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class PlaceOrderDTO {

    private String customerId;
    private String orderID;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date = new Date();
    private double amount;
    private List<OrderDetailDTO> orderDetailDTOList;

    public PlaceOrderDTO() {
    }

    public PlaceOrderDTO(String customerId, String orderID, Date date, double amount, List<OrderDetailDTO> orderDetailDTOList) {
        this.customerId = customerId;
        this.orderID = orderID;
        this.date = date;
        this.amount = amount;
        this.orderDetailDTOList = orderDetailDTOList;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getorderID() {
        return orderID;
    }

    public void setorderID(String orderID) {
        this.orderID = orderID;
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
                ", orderID='" + orderID + '\'' +
                ", date=" + date +
                ", orderDetailDTOList=" + orderDetailDTOList +
                '}';
    }
}
