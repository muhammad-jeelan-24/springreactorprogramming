package com.sonic.spring.reactor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonic.spring.reactor.dao.CustomerDAO;
import com.sonic.spring.reactor.dto.Customer;

import reactor.core.publisher.Flux;

@Service
public class CustomerService {
	
	
	@Autowired
	private CustomerDAO customerDAO;
	
	public List<Customer> getCustomerService(){
		
		return customerDAO.getCustomerList();
		
	}
	
	public Flux<Customer> getCustomerListFromStream(){
		return customerDAO.getCustomerListAsStream();
	}

}
