package com.atcs.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atcs.data.Aircraft;
import com.atcs.data.AircraftSize;
import com.atcs.data.AircraftType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class HealthCheckController {

	@RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
	public String healthCheck() {
		return "healthcheck";
	}

	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		Aircraft obj = new Aircraft();
		obj.setAircraftName("AIRINDIA");
		obj.setAircraftSize(AircraftSize.LARGE);
		obj.setAircraftType(AircraftType.PASSENGER);

		// Object to JSON in file
		// mapper.writeValue(new File(""), obj);

		// Object to JSON in String
		String jsonInString = mapper.writeValueAsString(obj);
		System.out.println(jsonInString);
	}
}
