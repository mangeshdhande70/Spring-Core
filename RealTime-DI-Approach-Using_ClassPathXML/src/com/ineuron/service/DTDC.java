package com.ineuron.service;

public class DTDC implements Courier {
	
	static {
		System.out.println("DTDC :: class loading.....");
	}
	
	public DTDC() {
		System.out.println("BlueDart:: Zero param constructor...");
	}

	@Override
	public String deliver(int orderId) {
		// TODO Auto-generated method stub
		return " DTDC for order Id :: "+orderId;
	}

}
