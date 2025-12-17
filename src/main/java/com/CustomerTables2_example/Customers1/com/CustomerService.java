package com.CustomerTables2_example.Customers1.com;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository repo = null;
    private final PasswordEncoder encoder = null;

    public String registerCustomer(CustomerRequest reg) {

        if (repo.existsByEmail(reg.getEmail())) {
            return "Email already registered";
        }

        Customer c = new Customer();
        c.setName(reg.getName());
        c.setEmail(reg.getEmail());
        c.setPhone(reg.getPhone());
        c.setAddress(reg.getAddress());
        c.setPassword(encoder.encode(reg.getPassword()));

        repo.save(c);
        return "Customer Registered Successfully";
    }
}
