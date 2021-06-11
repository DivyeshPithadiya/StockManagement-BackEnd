package com.StockManagementSystem.StockManagementSystemAPI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StockManagementSystem.StockManagementSystemAPI.Services.AllServices;
import com.StockManagementSystem.StockManagementSystemAPI.Tables.AdminDetails;
import com.StockManagementSystem.StockManagementSystemAPI.Tables.UserDetails;

@RestController
public class AllAPI {
	
	
	@Autowired
	AllServices service;
	
	@GetMapping("/hello")
	String hello()
	{
		return "Hello";
	}
	
	@CrossOrigin(origins ="http://localhost:3000")
	@PostMapping("/storeuser")
	String storeUserDetails(@RequestBody UserDetails user)
	{
		return service.storeUserDetails(user);
	}
	
	

	@PostMapping("/login")
	String LoginValidation(@RequestBody AdminDetails admin )
	{
		return service.LoginValidation(admin);
	}
	
}
