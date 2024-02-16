package com.example.onlineCustomerServiceCenter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue()
    private Integer customerId;
    private String name;
    private String email;
    private String password;
    private String city;
    private String phoneNumber;
    @OneToMany
    private List<Issue> issues=new ArrayList<>();


    public Customer(Integer customerId, String name, String email, String password, String city, String phoneNumber, List<Issue> issues) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.issues = issues;
    }

    public Customer() {
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }
}