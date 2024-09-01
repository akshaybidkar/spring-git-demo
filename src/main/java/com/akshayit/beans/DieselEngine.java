package com.akshayit.beans;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements IEngine {
	public DieselEngine() {
		System.out.println("Diesel Engine::Constructor");
	}

	@Override
	public int start() {
     System.out.println("Diesel Class::Start()");
		return 0;
	}

}
