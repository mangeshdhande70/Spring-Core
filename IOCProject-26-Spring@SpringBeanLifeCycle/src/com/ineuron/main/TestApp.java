package com.ineuron.main;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ineuron.service.Voter;

public class TestApp {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("*****CONTAINER STARTED****\n");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ineuron/config/applicationContext.xml");

        Voter voter = context.getBean(Voter.class);
		
        
        System.out.println(voter);
        
        
        System.out.println(voter.checkVotingElgigbility());
        

		System.out.println("\n*****CONTAINER STOPPED****");
		
		
		
	}

}
