package com.springboot.dao;

import java.util.*;

import com.springboot.domain.Doctor;

public interface DoctorDAO {
  List<Doctor> list();
  Boolean save(Doctor doctor);
}
  
