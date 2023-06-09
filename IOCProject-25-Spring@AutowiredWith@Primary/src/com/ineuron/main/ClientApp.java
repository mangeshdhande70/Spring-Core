package com.ineuron.main;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ineuron.service.Voter;

public class ClientApp {

	public static void main(String[] args) throws Exception {
		System.out.println("*****Container Started*****\n");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/ineuron/config/applicationContext.xml");
		System.out.println("Bean id information :: " + Arrays.toString(context.getBeanDefinitionNames()));


		Voter voter = context.getBean(Voter.class);
		System.out.println(voter);

		System.out.println(voter.checkVotingEligibility());

		((AbstractApplicationContext) context).close();
		System.out.println("\n*****Container Stopped*****");
	}
}
