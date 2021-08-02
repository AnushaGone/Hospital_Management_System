package com.inno.SAS_HospitalManagement.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "employee_attendance")
public class EmployeeAttendance {
	@Column(name = "emp_id")
	@Id
	private String empId;
	@Column(name = "entry_date")
	private Date entryDate;

	@Column(name = "login_time")
	private Time loginTime;

	@Column(name = "logout_time")
	private Time logoutTime;

	public String getEmpId() {
		return empId;
	}

	public EmployeeAttendance(String empId, Date entryDate, Time loginTime, Time logoutTime) {

		this.empId = empId;
		this.entryDate = entryDate;
		this.loginTime = loginTime;
		this.logoutTime = logoutTime;
	}

	public EmployeeAttendance() {
		// TODO Auto-generated constructor stub
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Time getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Time loginTime) {
		this.loginTime = loginTime;
	}

	public Time getLogoutTime() {
		return logoutTime;
	}

	public void setLogoutTime(Time logoutTime) {
		this.logoutTime = logoutTime;
	}

}