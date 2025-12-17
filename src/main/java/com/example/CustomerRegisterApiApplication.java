package com.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.example1.details.customer")
@EnableJpaRepositories(basePackages = "com.example.details.repository")
public class CustomerRegisterApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerRegisterApiApplication.class, args);
    }
}
