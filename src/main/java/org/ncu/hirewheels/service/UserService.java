package org.ncu.hirewheels.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.ncu.hirewheels.entity.User;
import org.ncu.hirewheels.repository.UserRepository;
import org.ncu.hirewheels.service.UserService;

@Service
public class UserService{
	@Autowired
	UserRepository userRepository;
	
	public User createUser(User user) {
		User getUser = userRepository.findByEmail(user.getEmail());
		System.out.print(getUser);
		if(getUser!=null) {
	        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Username already exists!");
		}
		getUser = userRepository.findByMobileNumber(user.getMobileNumber());
		if(getUser!=null) {
	        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mobile number already exists!");
		}
		return userRepository.save(user);
	}
	
	public User getUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public User login(String email, String password) {
		User getUser =  userRepository.findByEmail(email);
		if(getUser==null) {
	        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "user with email does not exists!");
		}
		if(!getUser.getPassword().equals(password)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "wrong password");
		}
		
		return getUser;
	}
	
}