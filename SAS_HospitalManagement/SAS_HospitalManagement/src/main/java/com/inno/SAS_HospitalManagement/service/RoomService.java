package com.inno.SAS_HospitalManagement.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inno.SAS_HospitalManagement.model.Room;
import com.inno.SAS_HospitalManagement.repository.RoomRepository;

@Service
public class RoomService {
	
	private RoomRepository roomRepository;
	
	public RoomService(RoomRepository roomRepository)
	{
		this.roomRepository = roomRepository;
	}
	
	public void addRoom(Room room)
	{
		roomRepository.save(room);
	}
	
	@Transactional
	public int deleteRoom(int roomNo) {
		
		return roomRepository.deleteroom(roomNo);
	}
	
	@Transactional
	public Collection<Room> getRoomType(String roomType) {
		
		return roomRepository.getRoomType(roomType);
	}
	
	public Optional<Room> getbyId(int roomNo){
		return roomRepository.findById(roomNo);
	}

}

