package com.ineuron.service;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component(value = "voter")
@PropertySource(value = "com/ineuron/config/application.properties")
public class Voter {

	@Value("${voter.age}")
	private Integer age;
	
	@Value("${voter.name}")
	private String name;
	
	private Date dov;
	
	
	@PostConstruct
	public void myInit() {
		System.out.println("Voter.myInit()");
		
		dov = new Date();
		boolean flag = false;
		
		
		if (name == null) {
			System.out.println("Name not be null");
			flag = true;
		}
		if (age<0) {
			age*=-1;
		}
		
		if (flag) 
			throw new IllegalArgumentException("Invalid inputes....");
	
	}
	
	public String checkVotingElgigbility() {
		
		System.out.println("Voter.checkVotingElgigbility()");
		
		if (age>=18) {
			return "voter is elgible with name "+name +" age = " +age+" and voting date is :: "+dov;
		}
	
		return "voter not eligible";
	}
	
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("Voter.myDestroy()");
		name = null;
		age = null;
		dov = null;
		
	}

	@Override
	public String toString() {
		return "Voter [age=" + age + ", name=" + name + ", dov=" + dov + "]";
	}
	
	
	
	
	
	
}
