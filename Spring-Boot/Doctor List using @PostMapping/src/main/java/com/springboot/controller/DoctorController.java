package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.domain.Doctor;
import com.springboot.service.DoctorService;


@RestController
@RequestMapping("/doctor")
public class DoctorController 
{
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/list")
    List<Doctor> getDoctors() 
    {
        return doctorService.list();
    }

    @PostMapping("/create")
    Boolean create(@RequestBody Doctor doctor) 
    {
        return doctorService.save(doctor);
    }
}