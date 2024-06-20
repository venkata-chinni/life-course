package com.deepvital.life_course.entities;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerFollowupNotificationRepo extends PagingAndSortingRepository<CustomerFollowupNotification, Long> {
	

	@Query(nativeQuery = true, value = "SELECT c.CUSTOMER_NAME, c.EMAIL, c.PHONE_NUMBER, h.HOSPITAL_NAME, \r\n"
			+ "                     h.EMAIL AS HOSPITAL_EMAIL, h.PHONE_NUMBER AS HOSPITAL_PHONE_NUMBER, \r\n"
			+ "                     h.LOCATION AS HOSPITAL_ADDRESS, d.DOCTOR_NAME, n.FOLLOW_UP_DATE \r\n"
			+ "                     FROM CUSTOMER c \r\n"
			+ "                     JOIN CUSTOMER_FOLLOWUP_NOTIFICATION n ON n.CUSTOMER_ID = c.CUSTOMER_ID \r\n"
			+ "                     JOIN DOCTOR_DETAILS d ON n.DOCTOR_ID = d.DOCTOR_ID \r\n"
			+ "                     JOIN HOSPITAL h ON d.HOSPITAL_ID = h.HOSPITAL_ID \r\n"
			+ "                     WHERE n.FOLLOW_UP_DATE BETWEEN :startDate AND :endDate")
	List<CustomerFollowUpNotificationInfoProjection> getAllEligibleCustomerDetailsForFollowupNotifications(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
}
