package com.atcs.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atcs.data.Aircraft;
import com.atcs.service.FlightControlService;

@Controller
@RequestMapping(path = "flight")
public class FlightController {

	@Autowired
	FlightControlService flightControlService;

	@RequestMapping(path = "land", method = RequestMethod.POST)
	public String enqueueFlight(Aircraft aircraft) {
		return null;
	}

	@RequestMapping(path = "fly", method = RequestMethod.POST)
	public String dequeueFlight(Aircraft aircraft) {
		flightControlService.dequeue(aircraft);
		return null;
	}
}