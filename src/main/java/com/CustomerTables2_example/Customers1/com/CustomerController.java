package com.CustomerTables2_example.Customers1.com;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService service = new CustomerService();

    @PostMapping("/register")
    public String register(@RequestBody CustomerRequest request) {
        return service.registerCustomer(request);
    }
}
