package com.inno.SAS_HospitalManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inno.SAS_HospitalManagement.model.Employee;
import com.inno.SAS_HospitalManagement.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public void hireEmployee(Employee employee) 
	{
		employeeRepository.save(employee);
	}

	public Employee updateEmployee(Employee employee) 
	{
		return employeeRepository.save(employee);
	}

	public String fireEmployee(String emp_id) 
	{
		employeeRepository.deleteById(emp_id);
		return "Deleted Successfully";
	}
}
