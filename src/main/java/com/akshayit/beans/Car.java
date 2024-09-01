package com.akshayit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private IEngine engine;

	public Car(IEngine engine) {
		super();
		this.engine = engine;
		System.out.println("Car class::constructor");
	}

	public void drive() {
		int status = engine.start();
		if(status==0)
		{
			System.out.println("Jorney Started..");
		}
	}
}
