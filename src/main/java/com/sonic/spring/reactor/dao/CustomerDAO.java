package com.sonic.spring.reactor.dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Component;

import com.sonic.spring.reactor.dto.Customer;

import reactor.core.publisher.Flux;

@Component
public class CustomerDAO {
	
	
	public List<Customer> getCustomerList(){
		
		return IntStream.range(0, 20).mapToObj(i->new Customer(i,"customer"+i)).collect(Collectors.toList());
		
	}
	
	public Flux<Customer> getCustomerListAsStream(){
		
		return Flux.range(0, 20).doOnNext(i->System.out.println("Range--"+i))
				.map(i->new Customer(i,"Customer-"+i));
	}

}
