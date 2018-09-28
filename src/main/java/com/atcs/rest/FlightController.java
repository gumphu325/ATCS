package com.atcs.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
	public String enqueueFlight(Aircraft aircraft,ModelMap modelMap) {
		return flightControlService.enqueue(aircraft) ? aircraft.getAircraftName() + " successfully enqueued"
				: aircraft.getAircraftName() + " ATC is busy / full please try again after sometime";
	}

	@RequestMapping(path = "fly", method = RequestMethod.POST)
	public String dequeueFlight(Aircraft aircraft) {
		aircraft = flightControlService.dequeue(aircraft);
		return aircraft.getAircraftName() + " just flew !!!";
	}
}