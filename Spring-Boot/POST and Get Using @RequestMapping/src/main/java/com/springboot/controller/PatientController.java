package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.domain.Patient;
import com.springboot.service.PatientService;


@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Patient> listPatients() {
        return patientService.getPatients();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<Patient> createPatient(@RequestBody Patient patient) {
        return patientService.createPatient(patient);
    }
}
