package com.practice.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PracticeApplication {

	@GetMapping("/home")
	public String message(){
		return "Welcome to the Spring Web App";
	}
	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

}
