package com.deepvital.life_course.configurations;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.deepvital.life_course.entities.CustomerFollowUpNotificationInfoProjection;
import com.deepvital.life_course.entities.CustomerFollowupNotificationRepo;
import com.deepvital.life_course.service.EmailService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class EmailScheduler {
	
	@Autowired
	EmailService emailService;
	
	@Autowired
	CustomerFollowupNotificationRepo customerFollowupNotificationRepo;

	@Scheduled(cron = "0 */1 * * * *")
	public void sendNotifications() {
		log.info("Notification job started. timestamp={}", LocalDateTime.now());
		try {
			List<CustomerFollowUpNotificationInfoProjection> eligibleCustomers = getAllEigibleUserFollowUpNotification();
			
			if (!CollectionUtils.isEmpty(eligibleCustomers)) {
				eligibleCustomers.stream().forEach(customer -> emailService.sendMessage(customer));
				//text message
				//Whats App
			}
			
		}catch(Exception e) {
			log.error("Exception while running the job: "+e.getMessage(), e);
		}
	}

	
	private List<CustomerFollowUpNotificationInfoProjection> getAllEigibleUserFollowUpNotification() {
		return customerFollowupNotificationRepo.getAllEligibleCustomerDetailsForFollowupNotifications(LocalDate.now(),
				LocalDate.now().plusDays(7));

	}
	
}
