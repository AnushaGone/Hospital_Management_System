package com.inno.SAS_HospitalManagement.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Room")
public class Room {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomNo;
	
	@Column
	private String roomType;
	
	@Column
	private String status;
	
	@Column
	private String assignedTo;
	
	
	public Room() {
		this.status = "Available";	
	}
	
	public Room(int roomNo, String roomType, String status, String assignedTo) {
		super();
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.status = status;
		this.assignedTo=assignedTo;
	}
	
	public int getRoomNo() {
		return roomNo;
	}
	
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	
	public String getRoomType() {
		return roomType;
	}
	
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}	
}