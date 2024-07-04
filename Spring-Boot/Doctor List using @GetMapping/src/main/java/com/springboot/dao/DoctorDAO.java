package com.springboot.dao;

import java.util.*;
import org.springframework.stereotype.Component;

import com.springboot.domain.Doctor;

public interface DoctorDAO {
    List<Doctor> list();
}