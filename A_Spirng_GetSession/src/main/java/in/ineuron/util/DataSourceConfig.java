package in.ineuron.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@PropertySource(value = "in/ineuron/resources/application.properties")
public class DataSourceConfig {
	
	static {
		System.out.println("DataSourceConfig .class file is loading........");
	}

	public DataSourceConfig() {
		System.out.println("DataSourceConfig object is created using zero param constructor");
	}
	

	@Autowired
	private Environment environment;

	@Bean(value = "dataSource")
	public HikariDataSource getDataSource() {
		
		System.out.println("DataSourceConfig.getDataSource()");
		System.out.println("Implementation class name :: "+environment.getClass().getName());

		HikariDataSource hikariDataSource = new HikariDataSource();

		hikariDataSource.setDriverClassName(environment.getProperty("spring.jdbc.className"));
		hikariDataSource.setJdbcUrl(environment.getProperty("spring.jdbc.url"));
		hikariDataSource.setUsername(environment.getProperty("spring.jdbc.username"));
		hikariDataSource.setPassword(environment.getProperty("spring.jdbc.password"));
		hikariDataSource.setMinimumIdle(Integer.parseInt(environment.getProperty("spring.jdbc.minimumIdle")));
		hikariDataSource.setMaximumPoolSize(Integer.parseInt(environment.getProperty("spring.jdbc.maximumPoolSize")));
		hikariDataSource.setConnectionTimeout(Integer.parseInt(environment.getProperty("spring.jdbc.connectionTimeOut")));
		
		
		return hikariDataSource;

	}

}
