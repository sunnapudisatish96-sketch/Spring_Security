package com.zeroConfiguration.example.ZeroConfiguration_com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ZeroConfigurationComApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZeroConfigurationComApplication.class, args);
	}

}
