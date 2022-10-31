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
@Table(name = "location")
@EntityListeners(AuditingEntityListener.class)

public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long location_id;
	@Column( nullable = false)
	private String location_name;
	@Column( nullable = false)
	private String address;
	@Column( nullable = false)
	private String pincode;
	@Column( nullable = false)
	private Long city_id;
	public Long getLocation_id() {
		return location_id;
	}
	public void setLocation_id(Long location_id) {
		this.location_id = location_id;
	}
	public String getLocation_name() {
		return location_name;
	}
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Long getCity_id() {
		return city_id;
	}
	public void setCity_id(Long city_id) {
		this.city_id = city_id;
	}
	@Override
	public String toString() {
		return "Location [location_id=" + location_id + ", location_name=" + location_name + ", address=" + address
				+ ", pincode=" + pincode + ", city_id=" + city_id + "]";
	}
	
	
	

}