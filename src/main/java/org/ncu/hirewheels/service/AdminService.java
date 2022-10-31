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
import org.ncu.hirewheels.entity.Booking;
import org.ncu.hirewheels.entity.User;
import org.ncu.hirewheels.entity.Vehicle;
import org.ncu.hirewheels.entity.Vehicle_category;
import org.ncu.hirewheels.entity.Vehicle_subcategory;
import org.ncu.hirewheels.repository.VehicleRepository;
import org.ncu.hirewheels.repository.VehicleSubCategoryRepository;
import org.ncu.hirewheels.repository.VehicleCategoryRepository;
import org.ncu.hirewheels.repository.BookingRepository;
import org.ncu.hirewheels.repository.FuelTypeRepository;
import org.ncu.hirewheels.repository.LocationRepository;

@Service
public class AdminService{
	@Autowired
	VehicleSubCategoryRepository vehicleSubCategoryRepository;
	
	@Autowired
	VehicleCategoryRepository vehicleCategoryRepository; 
	
	@Autowired
	VehicleRepository vehicleRepository; 
	
	@Autowired
	BookingRepository bookingRepository;
	
	public Vehicle_subcategory addVehicleSubCategoryRepository(Vehicle_subcategory vehicleSubCategory) {
		Long categoryId = vehicleSubCategory.getvehicleCategoryId();
		Vehicle_category getCategory = vehicleCategoryRepository.findOneByVehicleCategoryId(categoryId);
		
//		if(getCategory!=null) {
//	        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "wrong category id firs add category");
//		}
//		
		
		return vehicleSubCategoryRepository.save(vehicleSubCategory);
	}
	
	
	public Vehicle_category addVehicleCategory(Vehicle_category vehicle_category) {
		return vehicleCategoryRepository.save(vehicle_category);
	}
	
	public Vehicle addVehicle(Vehicle vehicle) {
		Vehicle_subcategory vehicle_subcategory = vehicleSubCategoryRepository.findOneByvehicleSubcategoryId(vehicle.getvehicleSubCategoryId());
		
		if(vehicle_subcategory == null) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "wrong sub_category id first add sub_category");
		}
		
		vehicle.setPricePerDay(vehicle_subcategory.getPrice_per_day());
		
		return vehicleRepository.save(vehicle);
		
	}
	
	

	public Vehicle toggleVehicleAvailability(Vehicle vehicle) {
//		System.out.print("==================="+vehicleId);
		Vehicle getVehicle = vehicleRepository.findOneByVehicleId(vehicle.getvehicleId());
		if(getVehicle==null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "wrong vehicle id");
		getVehicle.setavailabilityStatus(vehicle.getavailabilityStatus());
		Vehicle putVehicle = vehicleRepository.save(getVehicle);
		return putVehicle;
	}
	
	
	public Booking BookVehicle(Booking booking) {
		Vehicle getVehicle = vehicleRepository.findOneByVehicleId(booking.getVehicle_id());
		if(getVehicle==null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "wrong vehicle id");
		if(getVehicle.getavailabilityStatus() == 0) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "vehicle not available");
		
		return bookingRepository.save(booking);
	}
	
	
}