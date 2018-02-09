package com.pasp.projeto2;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Inciando carro");

	}

	@Override
	public void stop() {
		System.out.println("Parando carro");

	}

}