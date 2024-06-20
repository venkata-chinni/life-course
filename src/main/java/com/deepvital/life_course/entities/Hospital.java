package com.deepvital.life_course.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Hospital {
	@Id
	@Column(name ="HOSPITAL_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String hospitalId;
	
	@Column(name = "HOSPITAL_NAME")
	String hospitalName;

	@Column(name = "EMAIL")
	String email;
	
	@Column(name="PHONE_NUMBER")
	String phoneNumber;
	
	@Column(name="SPECIALIZATION")
	String specialization;
	
	@Column(name = "LOCATION")
	String address;

}
