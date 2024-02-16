package com.example.onlineCustomerServiceCenter.service;

import com.example.onlineCustomerServiceCenter.dao.CustomerRepository;
import com.example.onlineCustomerServiceCenter.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer registerCustomer(Customer newCustomer) {
        return this.customerRepository.save(newCustomer);
    }
    public Customer updateCustomer(Customer customer){

    }
}
