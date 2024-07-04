package com.hrs.inheritence;

public class Devloper extends EmployesBase {
	String technology;

	public Devloper(long id, String name, String dept, double salary, String technology) {
		super(id, name, dept, salary);
		this.technology = technology;
	}
	
	protected void work() {
		super.work();
		System.out.println("Devlooper Work");
	}

}
