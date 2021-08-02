package com.inno.SAS_HospitalManagement.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inno.SAS_HospitalManagement.repository.AdminRepository;
import com.inno.SAS_HospitalManagement.repository.DoctorRepository;
import com.inno.SAS_HospitalManagement.repository.RoomRepository;
import com.inno.SAS_HospitalManagement.model.Doctor;
import com.inno.SAS_HospitalManagement.model.PatientAdmitInfo;
import com.inno.SAS_HospitalManagement.model.Room;

@Service
public class AdminService {

	private AdminRepository adminRepository;
	private RoomRepository roomRepository;
	private DoctorRepository doctorRepository;

	

	public AdminService(AdminRepository adminRepository, RoomRepository roomRepository,
			DoctorRepository doctorRepository) {
		super();
		this.adminRepository = adminRepository;
		this.roomRepository = roomRepository;
		this.doctorRepository = doctorRepository;
	}

	public void admit(PatientAdmitInfo patientAdmitInfo)
	{
		adminRepository.save(patientAdmitInfo);
	}
		
	@Transactional
	public void discharge(PatientAdmitInfo patientAdmitInfo) {
		adminRepository.updateDischarge(patientAdmitInfo.getDateOfDischarge(),
				patientAdmitInfo.getTimeOfDischarge(), patientAdmitInfo.getBillAmt(), patientAdmitInfo.getPatientId());
		System.out.println(patientAdmitInfo.getDateOfDischarge() + " " + patientAdmitInfo.getTimeOfDischarge() + " "
				+ patientAdmitInfo.getBillAmt() + " " + patientAdmitInfo.getPatientId());
	}
	
	public void assignRoom(Room room) 
	{
		roomRepository.updateRoom(room.getAssignedTo(), room.getStatus(), room.getRoomNo());
	}
	public int getRoomNo(int roomNo)
	{
		return roomRepository.getRoomNo(roomNo);
	
	}
	
	public Optional<Room> getRoomStatus(int roomNo)
	{
		return roomRepository.getRoomStatus(roomNo);		
	}

	public void patientDetails(Doctor doctor) {
		 doctorRepository.save(doctor);

	}
	public String doctorDetails(Doctor doctor)
	{
		doctorRepository.update(doctor.getSpacialization(),doctor.getDoc_id(),doctor.getConsultingPatientId());
		
		return "Succsessfull";
	}

}