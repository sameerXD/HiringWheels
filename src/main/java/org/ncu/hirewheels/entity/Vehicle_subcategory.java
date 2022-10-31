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
@Table(name = "vehicle_subcategory")
@EntityListeners(AuditingEntityListener.class)

public class Vehicle_subcategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long vehicleSubcategoryId;
	@Column( nullable = false)
	private String vehicle_subcategory_name;
	
	@Column( nullable = false)
	private Long price_per_day;
	
	@Column( nullable = false)
	private Long vehicleCategoryId;

	public Long getVehicleSubcategoryId() {
		return vehicleSubcategoryId;
	}

	public void setVehicle_subcategory_id(Long vehicleSubcategoryId) {
		this.vehicleSubcategoryId = vehicleSubcategoryId;
	}

	public String getVehicle_subcategory_name() {
		return vehicle_subcategory_name;
	}

	public void setVehicle_subcategory_name(String vehicle_subcategory_name) {
		this.vehicle_subcategory_name = vehicle_subcategory_name;
	}

	public Long getPrice_per_day() {
		return price_per_day;
	}

	public void setPrice_per_day(Long price_per_day) {
		this.price_per_day = price_per_day;
	}

	public Long getvehicleCategoryId() {
		return vehicleCategoryId;
	}

	public void setvehicleCategoryId(Long vehicleCategoryId) {
		this.vehicleCategoryId = vehicleCategoryId;
	}

	@Override
	public String toString() {
		return "User [vehicle_subcategory_id=" + vehicleSubcategoryId + ", vehicle_subcategory_name="
				+ vehicle_subcategory_name + ", price_per_day=" + price_per_day + ", vehicleCategoryId="
				+ vehicleCategoryId + "]";
	}
	
	
	
	

}