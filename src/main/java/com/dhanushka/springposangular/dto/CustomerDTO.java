/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.dhanushka.springposangular.dto;

import java.util.Arrays;

public class CustomerDTO {

    private String customerId;
    private String customerName;
    private String customerAddress;
    private String customerTele;
    private String customerEmail;
    private String customerImage;
    private byte[] byteImage;


    public CustomerDTO() {
    }

    public CustomerDTO(String customerId, String customerName, String customerAddress, String customerTele,
                       String customerEmail, String customerImage) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerTele = customerTele;
        this.customerEmail = customerEmail;
        this.customerImage = customerImage;
        this.byteImage = customerImage.getBytes();

    }

    public CustomerDTO(String customerId, String customerName, String customerAddress, String customerTele,
                       String customerEmail, byte[] byteImage) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerTele = customerTele;
        this.customerEmail = customerEmail;
        this.byteImage = byteImage;
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

    public String getCustomerImage() {
        return customerImage;
    }

    public void setCustomerImage(String customerImage) {
        this.customerImage = customerImage;
    }

    public byte[] getByteImage() {
        return byteImage;
    }

    public void setByteImage(byte[] byteImage) {
        this.byteImage = byteImage;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerTele='" + customerTele + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerImage='" + customerImage + '\'' +
                ", byteImage=" + Arrays.toString(byteImage) +
                '}';
    }
}
