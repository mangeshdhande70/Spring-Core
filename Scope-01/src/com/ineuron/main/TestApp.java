package com.ineuron.main;

import java.io.IOException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ineuron.service.Student;

public class TestApp {
	
	public static void main(String[] args) throws IOException {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/ineuron/config/applicationContext.xml");
		System.out.println("*****CONTAINER STARTED****\n");

		System.in.read();

		Student student = factory.getBean("fpkt", Student.class);
		System.out.println(student);
	

		System.out.println("\n*****CONTAINER STOPPED****");
		
		
		
	}

}
