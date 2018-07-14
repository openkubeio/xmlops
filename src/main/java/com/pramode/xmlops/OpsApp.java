package com.pramode.xmlops;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@SpringBootApplication
public

 class OpsApp 
{

	public static void main(String[] args) {
		SpringApplication.run(OpsApp.class, args);
	}

	
	 @GetMapping("/")
	  String home() {
	        return "Spring Boot App is up now ";
	    }
}


