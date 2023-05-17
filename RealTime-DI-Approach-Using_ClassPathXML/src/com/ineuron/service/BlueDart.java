package com.ineuron.service;

public class BlueDart implements Courier {
	
	static {
		System.out.println("BlueDart :: class loading.....");
	}
	
	public BlueDart() {
		System.out.println("BlueDart:: Zero param constructor...");
	}
	

	@Override
	public String deliver(int orderId) {
		// TODO Auto-generated method stub
		return "BlueDart for order Id :: "+orderId;
	}

}
