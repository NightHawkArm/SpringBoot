package com.example.microservicio.springairline.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.microservicio.springairline.model.AircraftFleet;

@Configuration
public class SpringAirlineConfiguration {
	
	@Bean
	public AircraftFleet aircraftFleet() {
		return new AircraftFleet();
	}
}
