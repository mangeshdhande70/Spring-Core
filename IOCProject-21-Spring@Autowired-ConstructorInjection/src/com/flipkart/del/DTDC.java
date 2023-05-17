package com.flipkart.del;

public class DTDC implements ICourier {
	
	static {
		System.out.println("DTDC Class is Loaded......");
	}
	
	private Long productId;
	
	

	public DTDC() {
		
		System.out.println("DTDC.DTDC()");
		
	}
	

	public DTDC(Long productId) {
		System.out.println("DTDC :: paramter");
		this.productId = productId;
	}

	@Override
	public String deliveryProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
