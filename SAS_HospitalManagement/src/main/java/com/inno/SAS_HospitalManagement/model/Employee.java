package com.inno.SAS_HospitalManagement.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee extends Person
{
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Sno;
	@Id
	@Column (name = "emp_id")
	private String emp_id;
	@Column
	private String department;
	@Column
	private String experience;
	@Column
	private double salary;
	@Column
	private Date joinDate;

	public Employee() {
	}

	public Employee(String emp_id, String department, String experience, double salary, Date joinDate) {
		this.emp_id = emp_id;
		this.department = department;
		this.experience = experience;
		this.salary = salary;
		this.joinDate = joinDate;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

}
