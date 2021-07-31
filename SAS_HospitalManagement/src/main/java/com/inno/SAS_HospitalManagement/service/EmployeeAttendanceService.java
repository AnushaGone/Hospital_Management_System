package com.inno.SAS_HospitalManagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inno.SAS_HospitalManagement.model.EmployeeAttendance;
import com.inno.SAS_HospitalManagement.repository.EmployeeAttendanceRepository;

@Service
public class EmployeeAttendanceService {
	@Autowired
	private EmployeeAttendanceRepository employeeAttendanceRepository;

	public void login(EmployeeAttendance employeeAttendance) {
		System.out.println("empId : " + employeeAttendance.getEmpId() + "/n EntryDate :"
				+ employeeAttendance.getEntryDate() + "/n LoginTime :" + employeeAttendance.getLoginTime());
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
