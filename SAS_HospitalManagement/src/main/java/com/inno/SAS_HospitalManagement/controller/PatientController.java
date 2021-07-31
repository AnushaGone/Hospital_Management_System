package com.inno.SAS_HospitalManagement.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inno.SAS_HospitalManagement.model.Patient;
import com.inno.SAS_HospitalManagement.service.PatientService;

@RestController
@RequestMapping("hospital/patient")
public class PatientController {

	@Autowired
	private PatientService patientService;

	@PostMapping(path = "register", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String register(@RequestBody Patient patient) {
		patientService.register(patient);
		return "Registered Successfully";
	}

	@PostMapping(path = "findPatient", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Patient> findPatient(@RequestBody Map<String, String> map) {
		return patientService.findPatient(map.get("patientId"));
	}
}
