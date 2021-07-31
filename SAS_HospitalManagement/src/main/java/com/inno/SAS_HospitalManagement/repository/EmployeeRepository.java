package com.inno.SAS_HospitalManagement.repository;


import org.springframework.data.repository.CrudRepository;

import com.inno.SAS_HospitalManagement.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

}
