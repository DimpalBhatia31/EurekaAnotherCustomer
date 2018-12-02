package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RestControllerAnother {
	
	

	@GetMapping("/details")
	public String get()
	{
		return "details of another";
	}
	
}
