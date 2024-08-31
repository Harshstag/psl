package com.springboot.service;

import java.util.*;
import org.springframework.stereotype.Component;

import com.springboot.domain.Doctor;

public interface DoctorService{
    List<Doctor> list();
}