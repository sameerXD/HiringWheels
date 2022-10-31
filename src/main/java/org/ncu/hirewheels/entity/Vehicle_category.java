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
@Table(name = "vehicle_category")
@EntityListeners(AuditingEntityListener.class)

public class Vehicle_category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long vehicleCategoryId;
	@Column( nullable = false)
	private String vehicle_category_name;
	public Long getVehicle_category_id() {
		return vehicleCategoryId;
	}
	public void setVehicle_category_id(Long vehicleCategoryId) {
		this.vehicleCategoryId = vehicleCategoryId;
	}
	public String getVehicle_category_name() {
		return vehicle_category_name;
	}
	public void setVehicle_category_name(String vehicle_category_name) {
		this.vehicle_category_name = vehicle_category_name;
	}
	@Override
	public String toString() {
		return "Vehicle_category [vehicle_category_id=" + vehicleCategoryId + ", vehicle_category_name="
				+ vehicle_category_name + "]";
	}
	
	
	
	

}