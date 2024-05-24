package com.goTravel.hotelService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HotelServiceApplication {

	@GetMapping("/api")
	public String getMS1() {
		return "Hotelservice up";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HotelServiceApplication.class, args);
		System.out.println("hotel service");
	}

}
