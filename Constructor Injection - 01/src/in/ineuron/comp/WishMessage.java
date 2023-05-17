package in.ineuron.comp;

import java.util.Date;

public class WishMessage {
	
	
	private Date date;

	public WishMessage(Date date) {
		super();
		System.out.println("WishMessage Object Cretaed Using Parameterized Constructor");
		this.date = date;
	}
	
	
	public void generateMessage() {
		
		System.out.println("Date is "+date);
		
	}
	

}
