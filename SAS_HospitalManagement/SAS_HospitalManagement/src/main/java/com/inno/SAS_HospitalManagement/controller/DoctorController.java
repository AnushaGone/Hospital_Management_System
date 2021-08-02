//
//package com.inno.SAS_HospitalManagement.controller;
//
//import java.sql.Date;
//import java.sql.Time;
//import java.util.Optional;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.inno.SAS_HospitalManagement.model.Doctor;
//import com.inno.SAS_HospitalManagement.model.Patient;
//import com.inno.SAS_HospitalManagement.model.PatientAdmitInfo;
//import com.inno.SAS_HospitalManagement.model.Room;
//import com.inno.SAS_HospitalManagement.service.DoctorService;
//import com.inno.SAS_HospitalManagement.service.PatientService;
//import com.inno.SAS_HospitalManagement.service.RoomService;
//
//@RestController
//@RequestMapping("hospital/doctor")
//public class DoctorController {
//	private final DoctorService doctorService;
//
//	public DoctorController(DoctorService doctorService) {
//		super();
//		this.doctorService = doctorService;
//	}
//
//	
//	@PostMapping(path="details",consumes = MediaType.APPLICATION_JSON_VALUE)
//	public String doctorDetails(@RequestBody Doctor doctor)
//	{
//		System.out.println(doctor.getSpacialization());
//		System.out.println(doctor.getDoc_id());
//		System.out.println(doctor.getConsultingPatientId());
//		doctorService.doctorDetails(doctor);
//		
//		return " Doctor details updated";
//	}
//
//
//}
