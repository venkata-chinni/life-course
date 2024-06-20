package com.deepvital.life_course.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CUSTOMER_FOLLOWUP_NOTIFICATION")
public class CustomerFollowupNotification {

	@Id
	@Column(name = "NOTIFICATION_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long notificationId;
	
	@Column(name = "CUSTOMER_ID")
	Long customerId;

	@Column(name = "FOLLOW_UP_DATE")
	LocalDateTime followUpDate;
	
	@Column(name="DOCTOR_ID")
	Long doctorId;
}
