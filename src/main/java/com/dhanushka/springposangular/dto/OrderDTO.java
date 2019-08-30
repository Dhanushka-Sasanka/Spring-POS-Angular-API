/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class OrderDTO {

    private String orderId;
    private String customerId;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date = new Date();
    private double amount;

    public OrderDTO() {
    }

    public OrderDTO(String orderId, String customerId, Date date, double amount) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.date = date;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "orderId='" + orderId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}
