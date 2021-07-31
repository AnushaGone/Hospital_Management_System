package com.inno.SAS_HospitalManagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="doctor")
public class Doctor  {
	 @Id
		private String consultingPatientId;
	
	private String Doc_id;
	
	private String Spacialization;

	private int patientRoom;
	
	private String patientDiagnosis;
	

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Doctor( String doc_id, String spacialization, String consultingPatientId, int patientRoom,
			String patientDiagnosis) {
		super();
		this.Doc_id = doc_id;
		this.Spacialization = spacialization;
		this.consultingPatientId = consultingPatientId;
		this.patientRoom = patientRoom;
		this.patientDiagnosis = patientDiagnosis;
	}

	public String getDoc_id() {
		return Doc_id;
	}

	public void setDoc_id(String doc_id) {
		this.Doc_id = doc_id;
	}

	public String getSpacialization() {
		return Spacialization;
	}

	public void setSpacialization(String spacialization) {
		this.Spacialization = spacialization;
	}

	public String getConsultingPatientId() {
		return consultingPatientId;
	}

	public void setConsultingPatientId(String consultingPatientId) {
		this.consultingPatientId = consultingPatientId;
	}

	public int getPatientRoom() {
		return patientRoom;
	}

	public void setPatientRoom(int patientRoom) {
		this.patientRoom = patientRoom;
	}

	public String getPatientDiagnosis() {
		return patientDiagnosis;
	}

	public void setPatientDiagnosis(String patientDiagnosis) {
		this.patientDiagnosis = patientDiagnosis;
	}
	

}
	