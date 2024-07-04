package com.springboot.service;

import java.util.*;

import com.springboot.domain.Doctor;

public interface DoctorService {
  List<Doctor> list();
  Boolean save(Doctor doctor);
}
  
