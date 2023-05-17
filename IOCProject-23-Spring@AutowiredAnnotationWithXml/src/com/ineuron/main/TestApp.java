package com.ineuron.main;

import java.io.IOException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ineuron.service.FlipKart;

public class TestApp {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("*****CONTAINER STARTED****\n");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ineuron/config/applicationContext.xml");


		FlipKart flipkart = context.getBean(FlipKart.class);
		
		System.out.println( flipkart.doShopping(new String[] { "fossil", "tissot" }, new Float[] { 23456.5f, 12345.5f }));

		System.out.println("\n*****CONTAINER STOPPED****");
		
		
		
	}

}
