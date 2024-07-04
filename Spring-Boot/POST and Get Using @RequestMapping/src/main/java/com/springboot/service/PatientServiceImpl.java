package com.springboot.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.PatientDAO;
import com.springboot.domain.Patient;



@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	private PatientDAO patientDAO;

	@Override
	public List<Patient> createPatient(Patient p) {
		return patientDAO.createPatient(p);
	}
	
	@Override
	public List<Patient> getPatients(){
		return patientDAO.getPatients();
	}
    
}