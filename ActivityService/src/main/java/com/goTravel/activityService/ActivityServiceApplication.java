package com.goTravel.activityService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ActivityServiceApplication {

	@GetMapping("/api3")
	public String getMS1() {
		return "Activityservice up";
	}

	public static void main(String[] args) {
		SpringApplication.run(ActivityServiceApplication.class, args);
		System.out.println("Activity service");
	}

}
