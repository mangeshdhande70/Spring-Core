package com.ineuron.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ineuron.service.FlipKart;

public class TestApp {
	
	public static void main(String[] args) throws IOException {
		
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("com/ineuron/config/applicationContext.xml");
		System.out.println("*****CONTAINER STARTED****\n");

		System.in.read();

		FlipKart flipkart = factory.getBean("fpkt", FlipKart.class);
		System.out.println(flipkart);
		String result = flipkart.doShopping(new String[] { "fossil", "tissot" }, new Float[] { 23456.5f, 12345.5f });
		System.out.println(result);

		System.out.println("\n*****CONTAINER STOPPED****");
		
		
		
	}

}
