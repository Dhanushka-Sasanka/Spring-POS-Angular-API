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

@Entity(name="Item")
public class ItemEntity implements Serializable {

    @Id
    private String itemcode;
    private String itemdescription;
    private int qunatity;
    private double unitprice;
    @OneToMany(mappedBy = "items",cascade = CascadeType.PERSIST)
    private List<OrderDetailEntity> orderDetail=new ArrayList<>();

    public ItemEntity() {
    }

    public ItemEntity(String itemcode, String itemdescription, int qunatity, double unitprice) {
        this.itemcode = itemcode;
        this.itemdescription = itemdescription;
        this.qunatity = qunatity;
        this.unitprice = unitprice;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemdescription() {
        return itemdescription;
    }

    public void setItemdescription(String itemdescription) {
        this.itemdescription = itemdescription;
    }

    public int getQunatity() {
        return qunatity;
    }

    public void setQunatity(int qunatity) {
        this.qunatity = qunatity;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public List<OrderDetailEntity> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(List<OrderDetailEntity> orderDetail) {
        this.orderDetail = orderDetail;
    }


}
