package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Value_annotation {

	@Value("${tells.read}")
	private String newName;
	@GetMapping("/")
	public String name(){
		return newName;
	}
}
