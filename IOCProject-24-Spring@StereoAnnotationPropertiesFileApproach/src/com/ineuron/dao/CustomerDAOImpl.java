package com.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ineuron.model.Customer;

@Repository
public class CustomerDAOImpl implements ICustomerDao {
	
	
	static {
		System.out.println("CustomerDAOImpl.enclosing_method()");
	}
	

	private static final String REALTIMEDI_CUSTOMER_INSERT_QUERY = "insert into customer(`custId`,`custName`,`address`)values(?,?,?)";

	int count = 0 ;
	
	@Autowired
	DataSource dataSource;


	@Override
	public boolean save(Customer customer) {

		try (Connection connection = dataSource.getConnection();
				PreparedStatement pstmt = connection.prepareStatement(REALTIMEDI_CUSTOMER_INSERT_QUERY)) {
             
			pstmt.setInt(1, customer.getCustId());
			pstmt.setString(2, customer.getCustName());
			pstmt.setString(3, customer.getCustAddres());
			
		

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return count>0?true:false;
	}

}
