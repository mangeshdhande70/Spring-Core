package in.ineuron.controller;

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

}
