package com.zeroConfiguration.example.ZeroConfiguration_com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeadController {
	@GetMapping("/hello")
	public String getHello() {
		return "Hello message SuccessFully";
	}

}
