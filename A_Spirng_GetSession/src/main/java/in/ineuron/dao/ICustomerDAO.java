package in.ineuron.dao;

import java.util.List;

import in.ineuron.model.Customer;

public interface ICustomerDAO {
	
	public boolean save(Customer customer);
	public List<Customer> getAllCustomer();

}
