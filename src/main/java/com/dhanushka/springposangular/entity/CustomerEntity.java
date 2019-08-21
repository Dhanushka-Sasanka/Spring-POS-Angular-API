/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity(name="Customer")
public class CustomerEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String customerId;
    private String customerName;
    private String customerAddress;
    private String customerTele;
    private String customerEmail;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<OrderEntity> orders = new ArrayList<>();

    public CustomerEntity() {
    }

    public CustomerEntity(String customerId, String customerName, String customerAddress, String customerTele, String customerEmail) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerTele = customerTele;
        this.customerEmail = customerEmail;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerTele() {
        return customerTele;
    }

    public void setCustomerTele(String customerTele) {
        this.customerTele = customerTele;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public List<OrderEntity> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderEntity> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerTele='" + customerTele + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", orders=" + orders +
                '}';
    }
}
