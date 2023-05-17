package com.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ineuron.dto.CustomerDTO;
import com.ineuron.services.ICustomerServices;

@Component
public class MyController {
	
	
	@Autowired
	ICustomerServices iCustomerServices;
	
	static {
		System.out.println("MyController.enclosing_method()");
	}
	
	public boolean save(CustomerDTO customerDTO) {
		
	     return iCustomerServices.save(customerDTO);
		
	}
	

}
