package com.ineuron.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ineuron.dao.ICustomerDao;
import com.ineuron.dto.CustomerDTO;
import com.ineuron.model.Customer;


@Component
public class CustomerServiceImpl implements ICustomerServices {
	
	
	static {
		System.out.println("CustomerServiceImpl.enclosing_method()");
	}
	
	@Autowired
	ICustomerDao iCustomerDao;

	@Override
	public boolean save(CustomerDTO customerDTO) {
		
		
		Customer customer = new Customer();
		
		customer.setCustId(customerDTO.getCustId());
		customer.setCustAddres(customerDTO.getCustAddres());
		customer.setCustName(customerDTO.getCustName());
		
		return iCustomerDao.save(customer);
	}

}
