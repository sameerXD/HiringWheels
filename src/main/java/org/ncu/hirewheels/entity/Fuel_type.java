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
@Table(name = "fuel_type")
@EntityListeners(AuditingEntityListener.class)

public class Fuel_type {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long fuel_type_id;
	@Column( nullable = false)
	private String fuel_type;
	public Long getFuel_type_id() {
		return fuel_type_id;
	}
	public void setFuel_type_id(Long fuel_type_id) {
		this.fuel_type_id = fuel_type_id;
	}
	public String getFuel_type() {
		return fuel_type;
	}
	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}
	@Override
	public String toString() {
		return "Fuel_type [fuel_type_id=" + fuel_type_id + ", fuel_type=" + fuel_type + "]";
	}
	
	
	
	
	
	
	

}