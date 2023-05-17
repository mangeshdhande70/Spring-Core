package com.ineuron.service;

public class GirlFreind {
	
	
	static {
		System.out.println("GirlFreind class Loading");
	}
	
	
	
	
	public GirlFreind() {
		System.out.println("GirlFreind Object created using Zero para Constructor");
	}

	private String name = "Dhairya";
	
	public String msg() {
		
		return "chal bsdk soja mai nh dene wali "+name;
		
	}

}
