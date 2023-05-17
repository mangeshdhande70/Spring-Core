package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zaxxer.hikari.HikariDataSource;

import in.ineuron.model.Customer;
import in.ineuron.util.DataSourceConfig;

@Repository
public class CustomerDAOImpl implements ICustomerDAO{
	
	
	@Autowired
	EntityManager entityManager;
	
	
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
	
	
	
	public List<Customer> getAllCustomer() {
		
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Customer> createQuery = builder.createQuery(Customer.class);
		
		Root<Customer> root = createQuery.from(Customer.class);
		
		CriteriaQuery<Customer> criteriaQuery = createQuery.select(root);
		Query<Customer> query = session.createQuery(criteriaQuery);
		

		return query.list();

	}
	
	

	

}
