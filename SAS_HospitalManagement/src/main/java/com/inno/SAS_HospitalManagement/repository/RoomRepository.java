package com.inno.SAS_HospitalManagement.repository;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.inno.SAS_HospitalManagement.model.Room;


public interface RoomRepository extends CrudRepository<Room, Integer> {

	@Transactional
	@Modifying
	@Query ("delete from Room r where r.roomNo =?1")
	public int deleteroom(int roomNo);
	
	
	@Query ("select r from Room r where r.roomType =?1")
	public Collection<Room> getRoomType(String roomType);
	
	@Query ("select roomNo from Room r where r.assignedTo =?1")
	int getRoomNo(int roomNo);

	@Query ("update Room set assigned_to=?1, status =?2 where room_no=?3")
	@Transactional
	@Modifying	
	int updateRoom(String assignedTo, String status, int roomNo);
	
	@Query ("select status from Room r where r.roomNo =?1")
	Optional<Room> getRoomStatus(int roomNo);

}
