/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Order_Detail_PK  implements Serializable {
    private String orderid;
    private String itemcode;

    public Order_Detail_PK() {
    }

    public Order_Detail_PK(String orderid, String itemcode) {
        this.orderid = orderid;
        this.itemcode = itemcode;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }
}
