package com.DealerPortal.Stryker_Backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "hospitaldetails")
public class HospitalDetailsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "customer_type")
    private String customerType;

    @Column(name="customer_name")
    private String customerName;

    @Column(name="requested_by")
    private String requestedBy;

    @Column(name="post_office")
    private String postOffice;

    @Column(name="city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "pincode")
    private String pincode;

    @Column(name="phone_number")
    private String phoneNumber;

    public HospitalDetailsModel() {
    }

    public HospitalDetailsModel(int id, String customerType, String customerName, String requestedBy, String postOffice, String city, String state, String pincode, String phoneNumber) {
        this.id = id;
        this.customerType = customerType;
        this.customerName = customerName;
        this.requestedBy = requestedBy;
        this.postOffice = postOffice;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public String getPostOffice() {
        return postOffice;
    }

    public void setPostOffice(String postOffice) {
        this.postOffice = postOffice;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
