package com.springboot.domain;

public class Doctor {
	
	private Integer id;
	private String name;
	private String qualification;
	private Double experience;
	private String specialization;
	private Double consultingFees;
		
	public Doctor() {
		
	}
	
	public Doctor(Integer id, String name, String qualification,
			Double experience, String specialization, Double consultingFees) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.experience = experience;
		this.specialization = specialization;
		this.consultingFees = consultingFees;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Double getExperience() {
		return experience;
	}
	public void setExperience(Double experience) {
		this.experience = experience;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public Double getConsultingFees() {
		return consultingFees;
	}
	public void setConsultingFees(Double consultingFees) {
		this.consultingFees = consultingFees;
	}
	
	
}
