package com.hibernatehotel.HibernateBonusLab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //this maps to the table
//this is like saying select * from person
@Table(name="hotels")
public class Hotel {
	@Id ///this is for a primary, you always need a primary key for hibernate\
	@GeneratedValue(strategy=GenerationType.IDENTITY)//allows the primary key to be auto-generated
	// strategy type above allows us to let MySQL do the auto incrementing
	
	@Column(name="hotel_id")
	private Long id;
	@Column(name="hotel_name")
	private String name;
	@Column(name="city")
	private String city;
	@Column(name="price_per_night")
	private String pricePerNight;

	public Hotel(Long id, String name, String city, String pricePerNight) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.pricePerNight = pricePerNight;
	}

	public Hotel() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(String pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

}
