package com.ineuron.service;

public class FirstFlight implements Courier {

	static {
		System.out.println("FirstFlight :: class loading.....");
	}
	
	public FirstFlight() {
		System.out.println("BlueDart:: Zero param constructor...");
	}

	@Override
	public String deliver(int orderId) {
	
		return " FirstFlight for order Id :: "+orderId;
	}

}
