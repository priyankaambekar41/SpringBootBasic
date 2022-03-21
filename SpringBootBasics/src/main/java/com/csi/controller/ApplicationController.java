package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Added new comment
@RestController
@RequestMapping("/api")
public class ApplicationController {
	
	@GetMapping
	public String sayHello(){
		return "Welcome to CSI Pune";
	}
	
	@GetMapping("/address")
	public String sayAddress(){
		return "INSPIRA MALL | PUNE";
	}
	
	@GetMapping("/servicies")
	public String sayServicies(){
		return "SOFTWARE DEVELOPMENT";
	}

}
