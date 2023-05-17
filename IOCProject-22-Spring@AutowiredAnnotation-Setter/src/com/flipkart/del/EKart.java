package com.flipkart.del;

public class EKart implements ICourier {
	
	static {
		System.out.println("EKart Class is Loaded......");
	}

	private Long productId;

	public EKart() {
		System.out.println("EKart.EKart()");
	}

	@Override
	public String deliveryProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
