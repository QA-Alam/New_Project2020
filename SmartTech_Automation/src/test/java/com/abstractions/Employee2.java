package com.abstractions;

public class Employee2 implements CompanyIdea {

	
	public void getEmployees() {
		System.out.println("Employee name is a : Malaika");
		
	}

	
	public void getSalary() {
		// TODO Auto-generated method stub
		System.out.println("Employee salary : 108000.00");
	}

	
	public void getCar() {
		// TODO Auto-generated method stub
		System.out.println("Employee car : new car");
	}

	
	public void gerMadicare() {
		// TODO Auto-generated method stub
		System.out.println("Employee madicade : no madicade");
	}

	public static void main(String[] args) {
		Employee2 obj = new Employee2();
		obj.getEmployees();
	}
}
