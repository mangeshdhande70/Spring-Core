package com.ineuron.main;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ineuron.config.MyConfiguration;
import com.ineuron.service.WishMessageGenerator;

public class TestApp {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("*****CONTAINER STARTED****\n");
		
	
       @SuppressWarnings("resource")
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);		
       
       
       System.out.println("Beans created by container :: "+Arrays.toString(applicationContext.getBeanDefinitionNames()));
       
       
        WishMessageGenerator messageGenerator = applicationContext.getBean(WishMessageGenerator.class);
        
        String msg = messageGenerator.msg("Rakesh");
        
        System.out.println(msg);
        
        

		System.out.println("\n*****CONTAINER STOPPED****");
		
		
		
	}

}
