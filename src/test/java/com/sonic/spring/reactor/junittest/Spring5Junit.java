package com.sonic.spring.reactor.junittest;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class Spring5Junit {
	
	@Test
	public void monotest() {
		Mono<String> monoString=Mono.just("Jeelan");
		
		StepVerifier.create(monoString).expectNext("Jeelan").verifyComplete();
		
	}
	
	@Test
	public void monoFailedTest() {
		Mono<String> monoString=Mono.just("Muhammad");
		
		StepVerifier.create(monoString).expectNext("Jeelan").verifyComplete();
		
	}
	
	@Test
	public void FluxTest() {
		Flux<String> fluxTest=Flux.just("Muhammad","Jeelan","Shaik");
		
		StepVerifier.create(fluxTest).expectNext("Muhammad")
		.expectNext("Jeelan").expectNext("Shaik").verifyComplete();
	}
	
	@Test
	public void FluxTest2() {
		Flux<String> fluxTest=Flux.just("Muhammad","Jeelan","Shaik").log();
		StepVerifier.create(fluxTest).expectNext("Muhammad")
		.expectNext("Jeelan").expectNext("Shaik").verifyComplete();
	}

}
