package com.inno.SAS_HospitalManagement.controller;

import java.sql.Date;
import java.sql.Time;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inno.SAS_HospitalManagement.model.EmployeeAttendance;
import com.inno.SAS_HospitalManagement.service.EmployeeAttendanceService;

@RestController
@RequestMapping("hospital/employee")
public class EmployeeAttendanceController {
	@Autowired
	private EmployeeAttendanceService employeeAttendanceService;

	@PostMapping(path = "login")
	public ResponseEntity<String>login(@RequestBody EmployeeAttendance employeeAttendance) {
		// adminiStrativeStaff.setEmpId("123A1");
		Time time = new Time(System.currentTimeMillis());
		Date date = new Date(System.currentTimeMillis());
		employeeAttendance.setLoginTime(time);
		employeeAttendance.setEntryDate(date);
		try
		{
		employeeAttendanceService.login(employeeAttendance);
		return ResponseEntity.ok("login Succsessfull");
		}
		catch(RuntimeException rex)
		{
			System.out.println(rex);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("database connection lossed");
		}

	}

	@PostMapping(path = "logout", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String logout(@RequestBody EmployeeAttendance employeeAttendance) {
		Time time = new Time(System.currentTimeMillis());
		Date date = new Date(System.currentTimeMillis());
		employeeAttendance.setLogoutTime(time);
		employeeAttendance.setEntryDate(date);
		employeeAttendanceService.logout(employeeAttendance);
		return "logout Succsessfull";

	}

	@GetMapping(path = "get/id")
	public Optional<EmployeeAttendance> getdetails(@RequestParam String empId) {

		return employeeAttendanceService.getdetails(empId);
	}
}
