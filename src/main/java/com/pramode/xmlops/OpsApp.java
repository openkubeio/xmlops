package com.pramode.xmlops;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


//		@RestController -- > Return string json as ressponse
//		@Controller     -- > Return view (static html and files ) as ressponse

@Controller
@SpringBootApplication

public class OpsApp 
{

	public static void main(String[] args) {
		SpringApplication.run(OpsApp.class, args);
	}

	
	@GetMapping("/")
//	@RequestMapping(method=RequestMethod.GET,value="/")
	String home() {		    
	      return "index.html";
	}
	 
	 
}


