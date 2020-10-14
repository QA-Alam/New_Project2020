package com.abstractions;

public class Employees implements CompanyIdea {

	
	public void getEmployees() {
		System.out.println("Employee name : Mohammed J Alam");

	}

	
	public void getSalary() {
		System.out.println("Employee Salary : 101000.00");

	}

	
	public void getCar() {
		System.out.println("Employee get : New car");

	}

	
	public void gerMadicare() {
		System.out.println("Employee get :full covareg");

	}

	public static void main(String[] args) {
		Employees obj = new Employees();
		obj.gerMadicare();
		obj.getEmployees();
		obj.getSalary();
		obj.getCar();
	
	}
}
