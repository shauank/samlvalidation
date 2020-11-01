package com.example.demo;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/sso")
public class ACHRestController {

	@GetMapping
	public void achGETURL(@RequestBody Map<String, String> authParams,  HttpServletRequest request) {
		System.out.println("test GET");
	}
	
	@PostMapping
	public void achPostURL(@RequestBody Map<String, String> authParams,  HttpServletRequest request) {
		System.out.println("test POST");
	}
}
