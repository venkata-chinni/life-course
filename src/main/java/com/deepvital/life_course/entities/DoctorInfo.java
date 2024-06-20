package com.deepvital.life_course.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "DOCTOR_DETAILS")
public class DoctorInfo {

	@Id
	@Column(name="DOCTOR_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long doctorId;
	
	@Column(name = "DOCTOR_NAME")
	String doctorName;

	@Column(name = "EMAIL")
	String email;
	
	@Column(name="PHONE_NUMBER")
	String phoneNumber;
	
	@Column(name="SPECIALIZATION")
	String specialization;
	
	@Column(name = "LOCATION")
	String address;
	
	@Column(name ="HOSPITAL_ID")
	Long hospitalId;
}
