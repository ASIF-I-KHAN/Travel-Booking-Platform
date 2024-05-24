package com.goTravel.flightService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FlightServiceApplication {
	
	@GetMapping("/api2")
	public String getMS1() {
		return "Flightservice up";
	}

	public static void main(String[] args) {
		SpringApplication.run(FlightServiceApplication.class, args);
		System.out.println("Flight service");
	}

}
