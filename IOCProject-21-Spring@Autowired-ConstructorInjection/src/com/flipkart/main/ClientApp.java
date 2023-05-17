package com.flipkart.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flipkart.del.FlipKart;

public class ClientApp {
	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/flipkart/cfg/applicationCpntext.xml");
		
		
		
		
		System.out.println("***** By Type ********");
		
        FlipKart bean1 = applicationContext.getBean("flip1" , FlipKart.class);
		
		System.out.println(bean1);
		
		
//		System.out.println("\n\n***** By Name ********");
//		
//		FlipKart bean2 = applicationContext.getBean("flip2" , FlipKart.class);
//		
//		System.out.println(bean2);
	
		
		
	}

}
