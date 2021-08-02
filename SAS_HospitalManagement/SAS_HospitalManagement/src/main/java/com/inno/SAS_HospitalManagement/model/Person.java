package com.inno.SAS_HospitalManagement.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {

	private String name;
	private int age;
	private String contact;
	private String gender;
	private String bloodGroup;
	private String address;

	public Person() {
	}

	public Person(String name, int age, String contact, String gender, String bloodGroup, String address) {
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
