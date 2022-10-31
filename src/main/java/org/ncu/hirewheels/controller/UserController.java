package org.ncu.hirewheels.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ncu.hirewheels.entity.Booking;
import org.ncu.hirewheels.entity.User;
import org.ncu.hirewheels.repository.UserRepository;
import org.ncu.hirewheels.service.AdminService;
import org.ncu.hirewheels.service.UserService;
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	AdminService adminService;
	
	
	@GetMapping("/info")
	public String getInfo() {
		return "sameer";
	}
//	@GetMapping("/user")
//	public List<User> getAllUsers() {
//		return UserRepository.findAll();
//	}

	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@PostMapping("/userLogin")
	public User login(@RequestBody User user) {
		return userService.login(user.getEmail(), user.getPassword());
	}
	
	@PostMapping("/bookings")
	public Booking booking(@RequestBody Booking booking) {
		return adminService.BookVehicle(booking);
	}


}