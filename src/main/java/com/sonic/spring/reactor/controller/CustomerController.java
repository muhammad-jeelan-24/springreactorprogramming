package com.sonic.spring.reactor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonic.spring.reactor.dto.Customer;
import com.sonic.spring.reactor.service.CustomerService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/streams")
	public Flux<Customer>  getAllProducts(){
		
		return customerService.getCustomerListFromStream();
	}

}
