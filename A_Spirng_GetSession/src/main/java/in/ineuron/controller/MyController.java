package in.ineuron.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ineuron.dto.CustomerDTO;
import in.ineuron.service.ICustomerService;
import in.ineuron.vo.CustomerFront;

@Component
public class MyController {
	
	static {
		System.out.println("MyController .class file is loading........");
	}

	public MyController() {
		System.out.println("MyController object is created using zero param constructor");
	}

	@Autowired
	private ICustomerService iCustomerService;

	public boolean saveCustomerDetails(CustomerFront customerFront) {

		CustomerDTO customerDTO = new CustomerDTO();

		customerDTO.setCustId(Integer.parseInt(customerFront.getCustId()));
		customerDTO.setCustName(customerFront.getCustName());
		customerDTO.setAddress(customerFront.getAddress());
		customerDTO.setMoneyPaid(Integer.parseInt(customerFront.getMoneyPaid()));
		customerDTO.setTotalBalance(Integer.parseInt(customerFront.getTotalBalance()));

		return iCustomerService.save(customerDTO);

	}
	
	public List<CustomerFront> getAllCustomers(){
		
		List<CustomerFront> list = new ArrayList<>();
		
		List<CustomerDTO> list2 = iCustomerService.getAllCustomer();
		
		list2.forEach((customerDto->{
			
		 CustomerFront customerFront = new CustomerFront();
		 customerFront.setCustId(customerDto.getCustId().toString());
		 customerFront.setAddress(customerDto.getAddress());
		 customerFront.setCustName(customerDto.getCustName());
		
		 list.add(customerFront);
			
		}));
		
		return list;
	}
	
	
	

}
