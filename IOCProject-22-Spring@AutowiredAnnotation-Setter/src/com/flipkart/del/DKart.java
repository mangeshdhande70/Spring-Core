package com.flipkart.del;

public class DKart implements ICourier {

	
	static {
		System.out.println("DKart Class is Loaded......");
	}
	
	
	private Long orderId;
	

	public DKart() {
		System.out.println("DKart.DKart()");
	}

	public DKart(Long orderId) {
		super();
		this.orderId = orderId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	@Override
	public String deliveryProduct() {
		return null;
	}

}
