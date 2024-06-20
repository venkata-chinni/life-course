package com.deepvital.life_course.service;

import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.deepvital.life_course.constants.Constants;
import com.deepvital.life_course.entities.CustomerFollowUpNotificationInfoProjection;

@Service
public class EmailService {

	@Autowired
	JavaMailSender emailSender;
	
	public void sendMessage(CustomerFollowUpNotificationInfoProjection customerDetails) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(customerDetails.getEmail());
		String text = Constants.customerFollowUpEmailNotificationMailText.replace("[Customer Name]", customerDetails.getCustomerName())
				.replace("[Doctor's Name]", customerDetails.getDoctorName())
				.replace("[Appointment Date]", String.valueOf(customerDetails.getFollowUpDate().toLocalDate()))
				.replace("[Appointment Time]", 
						String.valueOf(customerDetails.getFollowUpDate().toLocalTime()
								.format(DateTimeFormatter.ofPattern(Constants.customerFollowUpEmailNotificationMailTimeStampFormat))))
				.replace("[Hospital Name]", customerDetails.getHospitalName())
				.replace("[Hospital Address]", customerDetails.getHospitalAddress())
				.replace("[Contact Information]", customerDetails.getHospitalPhoneNumber());
		message.setSubject(Constants.customerFollowUpEmailNotificationMailSubject);
		message.setText(text);
		emailSender.send(message);
	}
}
