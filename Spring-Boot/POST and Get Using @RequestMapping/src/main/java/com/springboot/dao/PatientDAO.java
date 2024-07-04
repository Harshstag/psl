package com.springboot.dao;

import java.util.List;
import com.springboot.domain.Patient;

public interface PatientDAO {
  List<Patient> createPatient(Patient p);
    List<Patient> getPatients();
}
  