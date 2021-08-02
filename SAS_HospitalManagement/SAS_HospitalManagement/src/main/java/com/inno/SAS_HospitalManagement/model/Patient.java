package com.inno.SAS_HospitalManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "patient")
public class Patient extends Person {
	@Id
	@Column
	private String patientId;

	public Patient() {

	}

	public Patient(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
}
