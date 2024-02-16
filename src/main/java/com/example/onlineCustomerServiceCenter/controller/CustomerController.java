package com.example.onlineCustomerServiceCenter.controller;

import com.example.onlineCustomerServiceCenter.entity.Customer;
import com.example.onlineCustomerServiceCenter.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("customer")
    public Customer registerCustomer(@RequestBody Customer newCustomer){
        return this.customerService.registerCustomer(newCustomer);
    }

}
