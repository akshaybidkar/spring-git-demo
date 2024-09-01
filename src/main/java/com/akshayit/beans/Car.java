package com.akshayit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.scanner.Constant;

@Component
public class Car {
	private String data="akshaybidkar";
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
	public void getData()
	{
		if(data.equalsIgnoreCase(com.akshayit.beans.Constant.DATA_TYPE))
		{
			System.out.println("Welcome to github");
		}
	}
	
}
