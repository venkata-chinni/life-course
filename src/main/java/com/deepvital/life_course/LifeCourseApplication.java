package com.deepvital.life_course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync
@EnableScheduling
public class LifeCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(LifeCourseApplication.class, args);
	}

}
