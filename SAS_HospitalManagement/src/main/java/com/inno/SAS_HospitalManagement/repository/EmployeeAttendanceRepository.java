package com.inno.SAS_HospitalManagement.repository;

import java.sql.Date;
import java.sql.Time;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.inno.SAS_HospitalManagement.model.EmployeeAttendance;

public interface EmployeeAttendanceRepository extends CrudRepository<EmployeeAttendance ,String>{
	
@Query("update employee_attendance set logout_time=?1 where emp_id=?2 and entry_date=?3")
@Transactional
@Modifying
int upadateLogoutTime(Time logoutTime,String empId,Date entryDate);
}
