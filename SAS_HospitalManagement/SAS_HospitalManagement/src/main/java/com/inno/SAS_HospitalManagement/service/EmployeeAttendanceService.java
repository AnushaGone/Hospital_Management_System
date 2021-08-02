package com.inno.SAS_HospitalManagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.inno.SAS_HospitalManagement.model.EmployeeAttendance;
import com.inno.SAS_HospitalManagement.repository.EmployeeAttendanceRepository;

@Service
public class EmployeeAttendanceService {
	
	private final EmployeeAttendanceRepository employeeAttendanceRepository;
	private final RestTemplate restTemplate ;
	

	public EmployeeAttendanceService(EmployeeAttendanceRepository employeeAttendanceRepository,
			RestTemplate restTemplate) {
		this.employeeAttendanceRepository = employeeAttendanceRepository;
		this.restTemplate = restTemplate;
	}

	public void login(EmployeeAttendance employeeAttendance) throws RuntimeException{
		System.out.println("empId : " + employeeAttendance.getEmpId() + "/n EntryDate :"
				+ employeeAttendance.getEntryDate() + "/n LoginTime :" + employeeAttendance.getLoginTime());
//		ResponseEntity<String> entity = restTemplate.postForEntity("http://localhost:8080/hospital/employee/login",employeeAttendance,String.class);
//		System.out.println("Making call to 8080");
//		System.out.println(entity.getBody());
		employeeAttendanceRepository.save(employeeAttendance);
	}

	@Transactional
	public void logout(EmployeeAttendance employeeAttendance) {
		employeeAttendanceRepository.upadateLogoutTime(employeeAttendance.getLogoutTime(),
				employeeAttendance.getEmpId(), employeeAttendance.getEntryDate());
	}

	public Optional<EmployeeAttendance> getdetails(String empId) {
		// TODO Auto-generated method stub
		return employeeAttendanceRepository.findById(empId);
	}
}
