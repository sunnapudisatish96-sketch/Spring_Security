package com.example.details.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example1.details.customer.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
