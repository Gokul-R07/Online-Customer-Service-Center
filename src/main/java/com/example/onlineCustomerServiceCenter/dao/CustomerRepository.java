package com.example.onlineCustomerServiceCenter.dao;

import com.example.onlineCustomerServiceCenter.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
