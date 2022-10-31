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
@Table(name = "bookings")
@EntityListeners(AuditingEntityListener.class)

public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long booking_id;
	
	@Column( nullable = false)
	private Date pickup_date;
	
	@Column( nullable = false)
	private Date dropoff_date;
	
	@Column( nullable = false)
	private Date booking_date;
	
	@Column( nullable = false)
	private Long amount;
	
	
	@Column( nullable = false)
	private Long location_id;
	
	
	@Column( nullable = false)
	private Long vehicle_id;
	
	@Column( nullable = false)
	private Long user_id;

	public Long getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(Long booking_id) {
		this.booking_id = booking_id;
	}

	public Date getPickup_date() {
		return pickup_date;
	}

	public void setPickup_date(Date pickup_date) {
		this.pickup_date = pickup_date;
	}

	public Date getDropoff_date() {
		return dropoff_date;
	}

	public void setDropoff_date(Date dropoff_date) {
		this.dropoff_date = dropoff_date;
	}

	public Date getBooking_date() {
		return booking_date;
	}

	public void setBooking_date(Date booking_date) {
		this.booking_date = booking_date;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getLocation_id() {
		return location_id;
	}

	public void setLocation_id(Long location_id) {
		this.location_id = location_id;
	}

	public Long getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(Long vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "Booking [booking_id=" + booking_id + ", pickup_date=" + pickup_date + ", dropoff_date=" + dropoff_date
				+ ", booking_date=" + booking_date + ", amount=" + amount + ", location_id=" + location_id
				+ ", vehicle_id=" + vehicle_id + ", user_id=" + user_id + "]";
	}
	
	

}