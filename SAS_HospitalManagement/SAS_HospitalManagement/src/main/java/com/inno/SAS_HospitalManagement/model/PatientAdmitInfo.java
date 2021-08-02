package com.inno.SAS_HospitalManagement.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "patient_admit_info")
public class PatientAdmitInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patient_Sno;

	@Column
	private String patientId;

	@Column
	private String diagnosisInfo;

	@Column
	private Date dateOfAdmit;

	@Column
	private Time timeOfAdmit;

	@Column
	private Date dateOfDischarge;

	@Column
	private Time timeOfDischarge;

	@Column
	private double billAmt;

	private int assignedRoom;

	public PatientAdmitInfo() {

	}

	public PatientAdmitInfo(int patient_Sno, String patientId, String diagnosisInfo, Date dateOfAdmit, Time timeOfAdmit,
			Date dateOfDischarge, Time timeOfDischarge, double billAmt, int assignedRoom) {
		super();
		this.patient_Sno = patient_Sno;
		this.patientId = patientId;
		this.diagnosisInfo = diagnosisInfo;
		this.dateOfAdmit = dateOfAdmit;
		this.timeOfAdmit = timeOfAdmit;
		this.dateOfDischarge = dateOfDischarge;
		this.timeOfDischarge = timeOfDischarge;
		this.billAmt = billAmt;
		this.assignedRoom = assignedRoom;
	}

	public int getPatient_Sno() {
		return patient_Sno;
	}

	public void setPatient_Sno(int patient_Sno) {
		this.patient_Sno = patient_Sno;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getDiagnosisInfo() {
		return diagnosisInfo;
	}

	public void setDiagnosisInfo(String diagnosisInfo) {
		this.diagnosisInfo = diagnosisInfo;
	}

	public Date getDateOfAdmit() {
		return dateOfAdmit;
	}

	public void setDateOfAdmit(Date dateOfAdmit) {
		this.dateOfAdmit = dateOfAdmit;
	}

	public Time getTimeOfAdmit() {
		return timeOfAdmit;
	}

	public void setTimeOfAdmit(Time timeOfAdmit) {
		this.timeOfAdmit = timeOfAdmit;
	}

	public Date getDateOfDischarge() {
		return dateOfDischarge;
	}

	public void setDateOfDischarge(Date dateOfDischarge) {
		this.dateOfDischarge = dateOfDischarge;
	}

	public Time getTimeOfDischarge() {
		return timeOfDischarge;
	}

	public void setTimeOfDischarge(Time timeOfDischarge) {
		this.timeOfDischarge = timeOfDischarge;
	}

	public double getBillAmt() {
		return billAmt;
	}

	public void setBillAmt(double billAmt) {
		this.billAmt = billAmt;
	}

	public int getAssignedRoom() {
		return assignedRoom;
	}

	public void setAssignedRoom(int assignedRoom) {
		this.assignedRoom = assignedRoom;
	}
	
}
