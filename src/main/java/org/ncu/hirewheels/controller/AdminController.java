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
import org.ncu.hirewheels.entity.User;
import org.ncu.hirewheels.entity.Vehicle;
import org.ncu.hirewheels.entity.Vehicle_category;
import org.ncu.hirewheels.entity.Vehicle_subcategory;
import org.ncu.hirewheels.service.AdminService;
import org.ncu.hirewheels.service.UserService;
@RestController
@RequestMapping("/api/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@PostMapping("/addVehicleCategory")
	public Vehicle_category createCategory(@RequestBody Vehicle_category Vehicle_category) {
		return adminService.addVehicleCategory(Vehicle_category);
	}
	
	@PostMapping("/addVehicleSubCategory")
	public Vehicle_subcategory createSubCategory(@RequestBody Vehicle_subcategory vehicle_subcategory) {
		return adminService.addVehicleSubCategoryRepository(vehicle_subcategory);
	}
	
	@PostMapping("/addVehicle")
	public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
		return adminService.addVehicle(vehicle);
	}
	
	
	@PutMapping("/updateVehicle")
	public Vehicle updateVehicle( @RequestBody Vehicle vehicle) {
		return adminService.toggleVehicleAvailability(vehicle);
	}


}