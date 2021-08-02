package com.inno.SAS_HospitalManagement.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inno.SAS_HospitalManagement.model.Room;
import com.inno.SAS_HospitalManagement.service.RoomService;

@RestController
@RequestMapping("hospital/room")
public class RoomController {
	
	private final RoomService roomService;
	
	public RoomController(RoomService roomService)
	{
		this.roomService = roomService;
	}
		
	@RequestMapping(path="addroom")
	public ResponseEntity<String> addRoom(@RequestBody Room room)
	{
		try 
		{
			roomService.addRoom(room);
			return ResponseEntity.ok("inserted");		
		}
		catch(RuntimeException nfe)
		{
			System.out.println(nfe.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("method not found");
		}
	}
	@DeleteMapping(path ="deleteroom")
	public String deleteRoom(@RequestParam int roomNo) 
	{
		 if(roomService.deleteRoom(roomNo)==1) {
		 	return "deleted successfully";
		 }
		 else {
			return "not deleted";  
		 }		 
		 
	}
	
	@GetMapping(path ="getroom")
	public Collection<Room> getRoomType(@RequestParam String roomType) {
		return roomService.getRoomType(roomType);
		 
		
	}
	@GetMapping(path ="getroom/id")
	public Optional<Room> getbyId(int roomNo){
		return roomService.getbyId(roomNo);
	} 
}
