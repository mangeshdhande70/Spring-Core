package com.ineuron.service;



import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wmsg")
public class WishMessageGenerator {
	
	
	static {
		System.out.println("WishMessageGenerator.enclosing_method()");
	}
	
	
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator object Created Using zero paramter Constructor");
		}



	@Autowired(required = true)
	@Qualifier("date1")
	private LocalDateTime localDateTime;
	
	@Autowired
	private GirlFreind girlFreind;
	
	
	
	public String msg(String name) {
		
		int hour = localDateTime.getHour();
		
		
		System.out.println(girlFreind.msg());
		
		System.out.println("\n\n********************************");
		
		
		
		if (hour<12)
			return "Good Morning "+name;
		else if (hour<16) 
			return "Good Afternoon "+name;
		else if (hour<20)
			return "Good Evening "+name;
		else 
		    return "Good Night "+name;
		
	}



	@Override
	public String toString() {
		return "WishMessageGenerator [localDateTime=" + localDateTime + ", girlFreind=" + girlFreind + "]";
	}
	
	
	

}
