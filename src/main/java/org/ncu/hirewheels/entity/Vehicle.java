package org.ncu.hirewheels.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "vehicles")
@EntityListeners(AuditingEntityListener.class)

public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long vehicleId;


	private String vehicle_model;
	
	@Column(unique = true, nullable = false)
	private String vehicle_number;

	private String color;

	@Column(nullable = false)
	private Long vehicleSubCategoryId;

	@Column(nullable = false)
	private Long pricePerDay;
	
	
	@Column(nullable = false)
	private int fuel_type_id;
	
	@Column(nullable = false)
	private int location_id;

	@Column(nullable = false, columnDefinition = "int default 1")
	private int availabilityStatus;
	
	
	@Column(nullable = false)
	private String vehicle_image_URL;


	public Long getvehicleId() {
		return vehicleId;
	}


	public void setvehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}


	public String getVehicle_model() {
		return vehicle_model;
	}


	public void setVehicle_model(String vehicle_model) {
		this.vehicle_model = vehicle_model;
	}


	public String getVehicle_number() {
		return vehicle_number;
	}


	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Long getvehicleSubCategoryId() {
		return vehicleSubCategoryId;
	}


	public void setvehicleSubCategoryId(Long vehicleSubCategoryId) {
		this.vehicleSubCategoryId = vehicleSubCategoryId;
	}


	public int getFuel_type_id() {
		return fuel_type_id;
	}


	public void setFuel_type_id(int fuel_type_id) {
		this.fuel_type_id = fuel_type_id;
	}


	public int getLocation_id() {
		return location_id;
	}


	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}


	public int getavailabilityStatus() {
		return availabilityStatus;
	}


	public void setavailabilityStatus(int availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}


	public String getVehicle_image_URL() {
		return vehicle_image_URL;
	}


	public void setVehicle_image_URL(String vehicle_image_URL) {
		this.vehicle_image_URL = vehicle_image_URL;
	}


	public Long getPricePerDay() {
		return pricePerDay;
	}


	public void setPricePerDay(Long pricePerDay) {
		this.pricePerDay = pricePerDay;
	}


	@Override
	public String toString() {
		return "User [vehicleId=" + vehicleId + ", vehicle_model=" + vehicle_model + ", vehicle_number="
				+ vehicle_number + ", color=" + color + ", vehicleSubCategoryId=" + vehicleSubCategoryId
				+ ", fuel_type_id=" + fuel_type_id + ", location_id=" + location_id + ", availabilityStatus="
				+ availabilityStatus + ", vehicle_image_URL=" + vehicle_image_URL + "]";
	}
	
	

}