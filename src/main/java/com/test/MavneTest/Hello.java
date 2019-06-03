package com.test.MavneTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {
	//@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorldService service = (HelloWorldService) context .getBean("helloWorldService");
		
		String message = service.sayHello();
		System.out.println("Message------>"+message);
		 service.setName("Sonali");
		 message = service.sayHello();
		System.out.println("Message------>"+message);
	}
}
