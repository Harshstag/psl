package com.hrs.inheritence;

public class Manager extends EmployesBase {
	String[] projects;

	public Manager(long id, String name, String dept, double salary, String[] projects) {
		super(id, name, dept, salary);
		this.projects = projects;
	}
	
	protected void work() {
		super.work();
		System.out.println("Manager Work");
	}
	

}
