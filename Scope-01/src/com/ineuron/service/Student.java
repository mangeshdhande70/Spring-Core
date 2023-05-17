package com.ineuron.service;

public class Student {
	
	private static  Student INSTANCE = null;
	
	private Student() {
		System.out.println("Student.Student()");
	}
	
	public static Student getInstance() {
		
		if (INSTANCE == null) {
			INSTANCE = new Student();	
		}
		
	 return	INSTANCE ;
		
	}

	@Override
	public String toString() {
		return "Student [hashCode()=" + hashCode() + "]";
	}



}
