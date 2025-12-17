package com.example.jt.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jt.LoginRequest;
import com.example.jt.util.JwtUtil;

@RestController

public class AuthController {
	private final JwtUtil jwtUtil;
	public AuthController(JwtUtil jwtUtil) {
		this.jwtUtil=jwtUtil;
	}
	@PostMapping("/logging")
	public String login(@RequestBody LoginRequest req) {
		if(req.getUsername().equals("admin")&&req.getPassword().equals("123")){
			return jwtUtil.generated(req.getUsername());
			
		}
		return "Invalid";
	}
}
//	private final JwtUtil jwtUtil;
//	
//	public AuthController(JwtUtil jwtUtil) {
//		this.jwtUtil=jwtUtil;
//	}
//	@PostMapping("/loging")
//	public String login(@RequestBody LoginRequest req) {
//		if(req.getUsername().equals("admin")&& req.getPassword().equals("123")) {
//			return jwtUtil.generate(req.getUsername());
//		}
//		return "Invalid";
//	}
//
//}
//private final JwtUtil jwtUtil;
//public Authcontroller(JwtUtil jwtUtil) {
//	this.jwtUtil=jwtUtil;
//	
//}
//@PostMapping("/loging")
//public String login(@RequestBody LoginRequest req) {
//	if(req.getUsername().equals("admin")&&req.getPassword().equals("123")) {
//		return jwtUtil.getnerate(req.getUsername());
//	}
//	return "Invalid";
//}
