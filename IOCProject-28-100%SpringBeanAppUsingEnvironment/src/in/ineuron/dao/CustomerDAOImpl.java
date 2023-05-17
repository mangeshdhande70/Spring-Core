package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zaxxer.hikari.HikariDataSource;

import in.ineuron.model.Customer;
import in.ineuron.util.DataSourceConfig;

@Repository
public class CustomerDAOImpl implements ICustomerDAO{
	
	static {
		System.out.println("CustomerDAOImpl .class file is loading........");
	}

	public CustomerDAOImpl() {
		System.out.println("CustomerDAOImpl object is created using zero param constructor");
	}
	
	
	 @Autowired
	 private DataSourceConfig dataSourceConfig;
	 
	 
	 private final String SQL_INSER_QUERY = "INSERT INTO customernew(`custId`,`custName`,`address`,`remianingBalance`) VALUES(?,?,?,?)";

	@Override
	public boolean save(Customer customer) {
		
		int executeUpdate = 0;
		
	   HikariDataSource dataSource = dataSourceConfig.getDataSource();
	   
	   try(Connection connection = dataSource.getConnection()) {
		PreparedStatement prepareStatement = connection.prepareStatement(SQL_INSER_QUERY);
		
		prepareStatement.setInt(1, customer.getCustId());
		prepareStatement.setString(2, customer.getCustName());
		prepareStatement.setString(3,customer.getAddress());
		prepareStatement.setFloat(4, customer.getRemianingAmount());
		
	
		executeUpdate = prepareStatement.executeUpdate();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
  
		
		
		return executeUpdate>0?true:false;
	}
	
	

}
