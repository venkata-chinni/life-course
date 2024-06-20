package com.deepvital.life_course.entities;

import java.time.LocalDateTime;

public interface CustomerFollowUpNotificationInfoProjection {

	String getCustomerName();
	
	String getEmail();
	
	String getPhoneNumber();
	
	String getHospitalName();
	
	String getHospitalEmail();
	
	String getHospitalPhoneNumber();
	
	String getHospitalAddress();
	
	String getDoctorName();
	
	LocalDateTime getFollowUpDate();
}
