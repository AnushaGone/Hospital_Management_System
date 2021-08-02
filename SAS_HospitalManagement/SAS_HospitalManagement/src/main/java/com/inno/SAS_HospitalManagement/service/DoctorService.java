//package com.inno.SAS_HospitalManagement.service;
//
//import org.springframework.stereotype.Service;
//
//import com.inno.SAS_HospitalManagement.model.Doctor;
//import com.inno.SAS_HospitalManagement.repository.DoctorRepository;
//
//@Service
//public class DoctorService
//{
//	private DoctorRepository doctorRepository;
//
//	public DoctorService(DoctorRepository doctorRepository) {
//		super();
//		this.doctorRepository = doctorRepository;
//	
//	}
//
//	public String doctorDetails(Doctor doctor)
//	{
//		doctorRepository.update(doctor.getSpacialization(),doctor.getDoc_id(),doctor.getConsultingPatientId());
//		
//		return "Succsessfull";
//	}
//
//	
//
//}
//
