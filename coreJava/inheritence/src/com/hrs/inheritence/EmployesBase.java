package com.hrs.inheritence;

public class EmployesBase {
	
	long id;
	String name;
	String dept;
	double salary;
	
	
	public EmployesBase(long id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	protected void work() {
		System.out.println("Comman Work to all");
	}
	
}
