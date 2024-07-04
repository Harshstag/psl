package com.springboot.dao;

import com.springboot.domain.Doctor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DoctorDAOImpl implements DoctorDAO
{
    static ArrayList<Doctor> doctorList = new ArrayList<Doctor>();

	static 
	{
		doctorList.add(new Doctor(1, "Harinii", "MBBS", 4.2, "Orthologist", 750.00));
		doctorList.add(new Doctor(2, "Nithin", "MBBS", 2.0, "Gynecologist", 1500.00));
	}
	
	@Override
	public Boolean save(Doctor doctor) 
	{
		return doctorList.add(doctor);
	}

	@Override
	public List<Doctor> list() 
	{
		return doctorList;
	}
}