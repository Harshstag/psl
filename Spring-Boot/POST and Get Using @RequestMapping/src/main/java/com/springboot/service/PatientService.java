package com.springboot.service;

import java.util.List;

import com.springboot.domain.Patient;

public interface PatientService {
    List<Patient> createPatient(Patient patient);
    List<Patient> getPatients();
}