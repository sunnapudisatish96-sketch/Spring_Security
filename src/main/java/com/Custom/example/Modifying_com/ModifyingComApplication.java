package com.Custom.example.Modifying_com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ModifyingComApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModifyingComApplication.class, args);
	}

}
