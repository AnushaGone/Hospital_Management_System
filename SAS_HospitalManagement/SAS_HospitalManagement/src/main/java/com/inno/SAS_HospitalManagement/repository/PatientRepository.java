package com.inno.SAS_HospitalManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.inno.SAS_HospitalManagement.model.Patient;

public interface PatientRepository extends CrudRepository<Patient, String> {
	
}
