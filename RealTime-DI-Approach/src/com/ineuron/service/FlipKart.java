package com.ineuron.service;

import java.util.Arrays;
import java.util.Random;

public class FlipKart {
	
  private Courier courier;
  private Float discount;
	
	public FlipKart() {
		super();
	}

	public FlipKart(Courier courier) {
		super();
		this.courier = courier;
		System.out.println("FlipKart.FlipKart()");
	}

	public Courier getCourier() {
		return courier;
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
		System.out.println("FlipKart.setCourier()");
	}
	
	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public String doShopping(String[] items,Float[] prices) {
		
		
		System.out.println("FlipKart.doShopping()");
		System.out.println("Impletmentation class is :: "+courier.getClass());
		System.out.println("Discount is :: "+discount+"%");
		
		
		
		int orderId = 0;
		Random random = null;
		
		float billAmount = 0;

		for(float price :prices) {
			billAmount+=price;
		}
		billAmount= billAmount - (discount) / 100.0f;
		random = new Random();
		orderId = random.nextInt(1000);
		
	
		return Arrays.toString(items)+"items for having price "+Arrays.toString(prices)+" Total BillAmount is :: "+billAmount+" order placed by "+courier.deliver(orderId);
	}
	
	
	
	

	@Override
	public String toString() {
		return "FlipKart [courier=" + courier + "]";
	}
	
	
	

}
