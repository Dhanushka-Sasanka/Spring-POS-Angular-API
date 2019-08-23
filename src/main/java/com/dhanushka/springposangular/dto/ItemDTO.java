/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.dto;

public class ItemDTO {

    private String itemcode;
    private String itemdescription;
    private int quantity;
    private double unitprice;

    public ItemDTO() {
    }

    public ItemDTO(String itemcode, String itemdescription, int quantity, double unitprice) {
        this.itemcode = itemcode;
        this.itemdescription = itemdescription;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "itemcode='" + itemcode + '\'' +
                ", itemdescription='" + itemdescription + '\'' +
                ", quantity=" + quantity +
                ", unitprice=" + unitprice +
                '}';
    }
}
