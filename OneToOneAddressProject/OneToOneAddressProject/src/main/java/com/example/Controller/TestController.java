package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Customer.Customer;
import com.example.Repository.CustomerRepository;

@RestController
public class TestController {
	private final CustomerRepository customerRepo;
	public TestController(CustomerRepository customerRepo) {
		this.customerRepo=customerRepo;
	}
	@PostMapping("/save")
	public Customer save(@RequestBody Customer customer) {
		return customerRepo.save(customer);
	}
	@GetMapping("/get/{id}")
	public Customer get(@PathVariable Long id) {
		return customerRepo.findById(id).orElse(null);
	}

}
