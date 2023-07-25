package com.oauth.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class HomeController {
	
	@GetMapping("/get-products")
	public List<String> getAllProducts(){
		return Arrays.asList("iPhone", "Samsung");
	}

	@GetMapping("/update-products")
	public String updateProducts(){
		return "Only logged-in users can access this end point";
	}
}
