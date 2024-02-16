package com.example.onlineCustomerServiceCenter.service;

import com.example.onlineCustomerServiceCenter.entity.Customer;

public interface CustomerService {
    Customer registerCustomer(Customer newCustomer);
    Customer updateCustomer(Customer customer);
}
