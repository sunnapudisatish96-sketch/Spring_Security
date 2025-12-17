package com.example.jt.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;

@Component
public class JwtUtil {
	private final SecretKey secretKey=Keys.hmacShaKeyFor("this_is_my_secret_key_123456".getBytes());
	public String generated(String username) {
		return Jwts.builder()
				.setSubject(username)
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis()+60000))
				.signWith(secretKey)
				.compact();
				
	}
}

//    private final SecretKey secretKey =
//            Keys.hmacShaKeyFor("this_is_my_very_secret_jwt_key_123456".getBytes());
//
//    public String generate(String username) {
//
//        return Jwts.builder()
//                .setSubject(username)
//                .setIssuedAt(new Date())
//                .setExpiration(new Date(System.currentTimeMillis() + 60_000)) 
//                .signWith(secretKey)
//                .compact();
//    }
//}
//private final SecretKey secretKey=Keys.hmacShaKeyFor("this_is_my_secret_key_23456".getBytes());
//public String generate(String username) {
//	return Jwts.builder()
//			.setSubject(username)
//			.setIssuedAt(new Date())
//			.setExpiration(new Date(System.currentTimeMillis()+60000))
//			.signWith(secretKey)
//			.compact();
//}
//}
