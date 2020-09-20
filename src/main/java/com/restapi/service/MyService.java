package com.restapi.service;

import java.util.List;

import com.restapi.model.Patient;

public interface MyService {
    
    List<Patient> listAll();
    List<Patient> getByFnameAndLname(String name);
    Patient saveOrUpdate(Patient patient);

}