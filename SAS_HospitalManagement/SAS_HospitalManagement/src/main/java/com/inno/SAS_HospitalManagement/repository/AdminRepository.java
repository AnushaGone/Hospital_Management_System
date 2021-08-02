package com.inno.SAS_HospitalManagement.repository;

import java.sql.Date;
import java.sql.Time;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.inno.SAS_HospitalManagement.model.PatientAdmitInfo;

public interface AdminRepository extends CrudRepository<PatientAdmitInfo, Integer> {

	@Query("update patient_admit_info set date_of_discharge=?1, time_of_discharge=?2, bill_amt=?3 where patient_id=?4")
	@Transactional
	@Modifying
	int updateDischarge(Date dateOfDischarge, Time timeOfDischarge, Double billAmt, String patientId);

}
