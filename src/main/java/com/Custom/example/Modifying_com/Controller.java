package com.Custom.example.Modifying_com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/public")
	public String publicEndPoint() {
		return "This is PUBLIC.NO login Required";
	}
	@GetMapping("/user")
	public String userEndPoint() {
		return "This is USER!.You are logged1";
	}
	@GetMapping("/admin")
	public String adminEndPoint() {
		return "This ADMIN.Only Admins can see this";
	}

}
