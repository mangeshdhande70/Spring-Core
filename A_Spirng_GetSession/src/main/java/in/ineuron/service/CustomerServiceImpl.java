package in.ineuron.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.ICustomerDAO;
import in.ineuron.dto.CustomerDTO;
import in.ineuron.model.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {

	static {
		System.out.println("CustomerServiceImpl .class file is loading........");
	}

	public CustomerServiceImpl() {
		System.out.println("CustomerServiceImpl object is created using zero param constructor");
	}

	@Autowired
	private ICustomerDAO iCustomerDAO;

	public Float getRemainingAmount(CustomerDTO customerDTO) {

		return (float) (customerDTO.getTotalBalance() - customerDTO.getMoneyPaid());

	}

	@Override
	public boolean save(CustomerDTO customerDTO) {

		Float remainingAmount = 0.0f;

		if (customerDTO.getMoneyPaid() < customerDTO.getTotalBalance()) {
			remainingAmount = getRemainingAmount(customerDTO);

		} else {
			System.out.println("enter correct amount");
			return false;
		}

		Customer customer = new Customer();
		BeanUtils.copyProperties(customerDTO, customer);
		customer.setRemianingAmount(remainingAmount);

		return iCustomerDAO.save(customer);
	}

	
	
	
	public List<CustomerDTO> getAllCustomer() {
		
		List<Customer> list = iCustomerDAO.getAllCustomer();
		
		List<CustomerDTO> dtos = new ArrayList<>();
		
		
		list.forEach((customer->{
			
			CustomerDTO customerDTO = new CustomerDTO();
			customerDTO.setCustId(customer.getCustId());
			customerDTO.setAddress(customer.getAddress());
			customerDTO.setCustName(customer.getCustName());
			
			dtos.add(customerDTO);
			
		}));

		return dtos;

	}

}
