package com.atcs.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
	public String healthCheck(ModelMap map) {
		map = new ModelMap();
		map.addAttribute("test", "Hello");
		return "healthcheck";
	}

	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		List<Aircraft> aircrafts = new ArrayList<>();
		Aircraft obj = new Aircraft();
		obj.setAircraftName("AIRINDIA");
		obj.setAircraftSize(AircraftSize.LARGE);
		obj.setAircraftType(AircraftType.PASSENGER);

		Aircraft obj1 = new Aircraft();
		obj1.setAircraftName("AIRINDIA_1");
		obj1.setAircraftSize(AircraftSize.SMALL);
		obj1.setAircraftType(AircraftType.PASSENGER);

		aircrafts.add(obj);
		aircrafts.add(obj1);
		// Object to JSON in file
		// mapper.writeValue(new File(""), obj);

		// Object to JSON in String
		String jsonInString = mapper.writeValueAsString(aircrafts);
		System.out.println(jsonInString);
	}
}
