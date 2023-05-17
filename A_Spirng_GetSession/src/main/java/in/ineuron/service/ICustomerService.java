package in.ineuron.service;

import java.util.List;

import in.ineuron.dto.CustomerDTO;

public interface ICustomerService {
	
	public boolean save(CustomerDTO customerDTO);

	public List<CustomerDTO> getAllCustomer();
	
}
