package com.inno.SAS_HospitalManagement.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inno.SAS_HospitalManagement.model.Doctor;
import com.inno.SAS_HospitalManagement.model.Employee;
import com.inno.SAS_HospitalManagement.service.EmployeeService;

@RestController
@RequestMapping("/hospital/admin")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	@PostMapping(path = "hire", consumes = MediaType.APPLICATION_JSON_VALUE)
	private String hireEmployee(@RequestBody Employee employee,Doctor doctor)
	{
		Date joinDate = new Date(System.currentTimeMillis());
		employee.setJoinDate(joinDate);
		//doctor.getEmp_id();
		employeeService.hireEmployee(employee);
		return "successful";
	}
	
//	@PutMapping(path = "updateemployee", consumes = MediaType.APPLICATION_JSON_VALUE)
//	public String updateEmployee(@RequestBody Employee employee)
//	{
//		Date joinDate = new Date(System.currentTimeMillis());
//		employee.setJoinDate(joinDate);
//		employeeService.updateEmployee(employee);
//		return "update successful";
//	}
	
	@DeleteMapping(path="fire")
	public String fireEmployee(@RequestParam String emp_id) 
	{
		employeeService.fireEmployee(emp_id);
		return "Deleted Successfully";
	}
}
