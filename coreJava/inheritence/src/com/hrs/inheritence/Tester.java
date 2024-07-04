package com.hrs.inheritence;

public class Tester extends EmployesBase {
	String[] tools;

	public Tester(long id, String name, String dept, double salary, String[] tools) {
		super(id, name, dept, salary);
		this.tools = tools;
	}
	
	protected void work() {
		super.work();
		System.out.println("Tester Work ");
	}

}
