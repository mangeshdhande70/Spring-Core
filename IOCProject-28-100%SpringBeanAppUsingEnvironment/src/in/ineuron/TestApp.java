package in.ineuron;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.ineuron.config.ConfigApp;
import in.ineuron.controller.MyController;
import in.ineuron.vo.CustomerFront;

public class TestApp {
	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		CustomerFront customerFront = new CustomerFront();
		
		System.out.println("Enter id");
		customerFront.setCustId(scanner.next());
		
		System.out.println("Enter Name");
		customerFront.setCustName(scanner.next());
		
		System.out.println("Enter Address");
		customerFront.setAddress(scanner.next());
		
		System.out.println("Enter Paid amount");
		customerFront.setMoneyPaid(scanner.next());
		
		System.out.println("Enter total balance");
		customerFront.setTotalBalance(scanner.next());
		
		
		
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
		
		
		MyController myController = context.getBean(MyController.class);
		boolean details = myController.saveCustomerDetails(customerFront);
		
		if (details) {
			System.out.println("Data saved");
		}else {
			System.out.println("not saved");
		}
		
		
		((AbstractApplicationContext)context).close();
		scanner.close();
		
	}

}
