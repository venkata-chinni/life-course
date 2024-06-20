package com.deepvital.life_course.constants;

public class Constants {

	public static final String customerFollowUpEmailNotificationMailText = """ 
			Dear [Customer Name],

			I hope this email finds you well.
			
			This is a friendly reminder about your upcoming appointment with Dr. [Doctor's Name] at [Hospital Name]. 
			
			Appointment Details:
			Doctor:  Dr. [Doctor's Name]
			Date:    [Appointment Date]
			Time:    [Appointment Time]
			Address: [Hospital Name], [Hospital Address]
			
			Please plan to arrive at least 10 minutes early to complete any necessary paperwork.
			
			If you have any questions or need to reschedule, please do not hesitate to contact us at Mobile No: [Contact Information].
			
			We look forward to seeing you.
			
			Best regards,
		    [Hospital Name] 
			
		""";
	public static final String customerFollowUpEmailNotificationMailSubject = "Reminder: Upcoming Doctor Appointment";
	
	public static final String customerFollowUpEmailNotificationMailTimeStampFormat = "hh:mm a"; 
}
