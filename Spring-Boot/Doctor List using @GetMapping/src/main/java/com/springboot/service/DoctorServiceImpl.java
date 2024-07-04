package com.springboot.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.DoctorDAO;
import com.springboot.domain.Doctor;



@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	private DoctorDAO doctorDAO;

	@Override
	public List<Doctor> list(){
		return doctorDAO.list();
	}
    
}