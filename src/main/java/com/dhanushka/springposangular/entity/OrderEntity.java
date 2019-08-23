/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name="Orders")
public class OrderEntity implements Serializable {
    @Id
    private String orderid;
    @Temporal(TemporalType.DATE)
    private Date date;
    private double amount;
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name= "customerId",referencedColumnName= "customerId")
    private CustomerEntity customer;

    @OneToMany(mappedBy = "orders",cascade = CascadeType.ALL)
    private List<OrderDetailEntity> orderDetail=new ArrayList<>();

    public OrderEntity() {
    }

    public OrderEntity(String orderid, Date date, double amount, CustomerEntity customer) {
        this.orderid = orderid;
        this.date = date;
        this.amount = amount;
        this.customer = customer;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
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

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }

    public List<OrderDetailEntity> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(List<OrderDetailEntity> orderDetail) {
        this.orderDetail = orderDetail;
    }

}
