package com.ineuron.main;

import java.io.IOException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ineuron.service.FlipKart;

public class TestApp {
	
	public static void main(String[] args) throws IOException {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/ineuron/config/applicationContext.xml");
		System.out.println("*****CONTAINER STARTED****\n");

		System.in.read();

		FlipKart flipkart = factory.getBean("fpkt", FlipKart.class);
		System.out.println(flipkart);
		String result = flipkart.doShopping(new String[] { "fossil", "tissot" }, new Float[] { 23456.5f, 12345.5f });
		System.out.println(result);

		System.out.println("\n*****CONTAINER STOPPED****");
		
		
		
	}

}
