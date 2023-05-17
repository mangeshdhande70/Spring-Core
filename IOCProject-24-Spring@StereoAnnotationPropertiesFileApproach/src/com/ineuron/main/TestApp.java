package com.ineuron.main;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ineuron.controller.MyController;
import com.ineuron.dto.CustomerDTO;

public class TestApp {
	
	public static void main(String[] args) throws IOException {
		
		
		
		try(Scanner scanner = new Scanner(System.in)){
		
		
		
		System.out.println("*****CONTAINER STARTED****\n");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/ineuron/config/applicationContext.xml");
		
		
		System.out.println("Bean Cretaed with id's :: "+Arrays.toString(context.getBeanDefinitionNames()));
		
		
		System.out.println("Enter Your Id");
		int id = scanner.nextInt();
		
		System.out.println("Enter tha Name");
		String name = scanner.next();
		
		System.out.println("Enter address");
		String adderss = scanner.next();
		
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustId(id);
		customerDTO.setCustName(name);
		customerDTO.setCustAddres(adderss);
	
		
		
		MyController controller = context.getBean(MyController.class);
		
		boolean save = controller.save(customerDTO);
		
		System.out.println(save);
		
	
		System.out.println("\n*****CONTAINER STOPPED****");
		
		
		scanner.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
