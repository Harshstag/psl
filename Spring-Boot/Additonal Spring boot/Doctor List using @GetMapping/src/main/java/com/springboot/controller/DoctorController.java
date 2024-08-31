package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.domain.Doctor;
import com.springboot.service.DoctorService;
import com.springboot.service.DoctorServiceImpl;

//Fill your code here
@RestController
@RequestMapping(value="/doctor")
public class DoctorController {
	@Autowired
	private DoctorServiceImpl doctorServiceImpl;

	@GetMapping(value="/list")
	public List<Doctor> getDoctors(){
		return doctorServiceImpl.list();
	}
}