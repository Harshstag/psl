package com.spring.entity;


public class Owner {
    private int id;
    private String name;
    private String password;
    private String mobileNumber;
    private String emailId;
    
    public int getId() {
    	return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Owner() {}
	
	public Owner(String name,String password,String mobilenumber,String emailid) {
		this.name = name;
        this.password = password;
        this.mobileNumber = mobilenumber;
        this.emailId = emailid;
		
	}
	public Owner(int id,String name,String pass,String mobilenumber,String emailid) {
		this.id = id;
		this.password = pass;
		this.name = name;
        this.mobileNumber = mobilenumber;
        this.emailId = emailid;
		
	}

}

