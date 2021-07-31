package com.inno.SAS_HospitalManagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inno.SAS_HospitalManagement.model.Patient;
import com.inno.SAS_HospitalManagement.repository.PatientRepository;

@Service
public class PatientService {
	@Autowired
	private PatientRepository patientRepository;

	public void register(Patient patient) {
		patientRepository.save(patient);
	}

	public Optional<Patient> findPatient(String patientId) {
		return patientRepository.findById(patientId);
	}
}
