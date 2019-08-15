/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.entity;

import javax.persistence.*;

@Entity(name="OrderDetails")
public class OrderDetailEntity {

    @EmbeddedId
    private Order_Detail_PK orderDetails;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "orderid", referencedColumnName = "orderid", insertable = false, updatable = false)
    private OrderEntity orders;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "itemcode", referencedColumnName = "itemcode", insertable = false, updatable = false)
    private ItemEntity items;

    private int qty;
    private double unitPrice;

    public OrderDetailEntity() {
    }

    public OrderDetailEntity(Order_Detail_PK orderDetails, int qty, double unitPrice, OrderEntity orders, ItemEntity items) {
        this.orderDetails = orderDetails;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.orders = orders;
        this.items = items;
    }

    public Order_Detail_PK getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Order_Detail_PK orderDetails) {
        this.orderDetails = orderDetails;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public OrderEntity getOrders() {
        return orders;
    }

    public void setOrders(OrderEntity orders) {
        this.orders = orders;
    }

    public ItemEntity getItems() {
        return items;
    }

    public void setItems(ItemEntity items) {
        this.items = items;
    }

}
