package com.ineuron.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ineuron.service.GirlFreind;

@Configuration
@ComponentScan(basePackages = {"com.ineuron"})
public class MyConfiguration {
	
	static {
		System.out.println("MyConfiguration.enclosing_method()");
	}
	
	

	
	public MyConfiguration() {
		System.out.println("MyConfiguration object Created Using zero paramter Constructor");
	}




	@Bean
	public LocalDateTime localDateTime1() {
		System.out.println("MyConfiguration.localDateTime()");
		return LocalDateTime.now();
	}
	
	@Bean(value = "date1")
	public LocalDateTime localDateTime2() {
		System.out.println("MyConfiguration.localDateTime()");
		return LocalDateTime.now();
	}
	
	
	@Bean(value = "date2")
	public GirlFreind girlFreind() {
		System.out.println("MyConfiguration.girlFreind()");
		return new GirlFreind();
	}




	@Override
	public String toString() {
		return "MyConfiguration []";
	}
	
	
	
	
	
	
}
