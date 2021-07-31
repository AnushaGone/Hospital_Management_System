package com.inno.SAS_HospitalManagement.repository;





import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.inno.SAS_HospitalManagement.model.Doctor;


public interface DoctorRepository extends CrudRepository<Doctor, Integer> 
{
//	@Query("update doctor set  patient_room=?1, patient_diagnosis=?2 where consulting_patient_id=?3")
//	@Transactional
//	@Modifying
//	int DoctorConsult( int patientRoom , String  patientDiagnosis , String consultingPatientId);
//
	@Query("update doctor set spacialization=?1,doc_id=?2 where consulting_patient_id=?3 ")
	@Transactional
	@Modifying
	int update(String Spacialization, String Doc_id,String consultingPatientId);

}
