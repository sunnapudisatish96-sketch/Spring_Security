package com.example.details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.details.repository.CustomerRepository;
import com.example1.details.customer.Customer;  

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerRepository repo;

    @PostMapping("/register")
    public Customer saveCustomer(@RequestBody Customer customer) {
        return repo.save(customer);
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomer() {
        return repo.findAll();
    }

}
