package com.hrs.inheritence;

public class TestClass{

	public static void main(String[] args) {
		String[] projects = new String[] {"BlockChain","IT Infra"};
		Manager m1 = new Manager(1010, "Harsh Signh", "IT", 10000000, projects) ;
		System.out.println(m1.id);
		System.out.println(m1.name);
		m1.work();

	}

}
