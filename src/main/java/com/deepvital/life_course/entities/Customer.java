package com.deepvital.life_course.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "CUSTOMER")
@Data
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CUSTOMER_ID")
	Long custmoerId;
	
	@Column(name="CUSTOMER_NAME")
	String customerName;
	
	@Column(name = "EMAIL")
	String email;
	
	@Column(name = "PHONE_NUMBER")
	String phoneNumber;
}
