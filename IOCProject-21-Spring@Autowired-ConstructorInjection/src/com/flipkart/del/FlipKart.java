package com.flipkart.del;

public class FlipKart {
	
	
	static {
		System.out.println("Flipkart class loaded...........");
	}
	
	
	private ICourier courier;
	
	private Integer discount;

	public FlipKart() {
		System.out.println("FlipKart.FlipKart()");
	}
	
	

	public FlipKart(ICourier courier, Integer discount) {
		System.out.println("FlipKart ::  paramter");
		this.courier = courier;
		this.discount = discount;
	}



	public ICourier getCourier() {
		return courier;
	}

	public void setCourier(ICourier courier) {
		System.out.println("FlipKart.setCourier()");
		this.courier = courier;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		System.out.println("FlipKart.setDiscount()");
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "FlipKart [courier=" + courier + ", discount=" + discount + "]";
	}
	
	
	
	

}
