package com.test.MavneTest;

import org.springframework.stereotype.Service;

@Service("helloWorldService")
public class HelloWorldService {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String sayHello()
	{
		return "Hello world";
		
	}

}
