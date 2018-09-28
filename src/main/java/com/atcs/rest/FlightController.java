package com.atcs.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
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
	public String enqueueFlight(@RequestBody Aircraft aircraft, ModelMap modelMap) {
		modelMap.addAttribute("msg", "Flight Enqueued");
		modelMap.put("queue", flightControlService.enqueue(aircraft));
		return "flight";
	}

	@RequestMapping(path = "fly", method = RequestMethod.POST)
	public String dequeueFlight(ModelMap modelMap) {
		modelMap.addAttribute("msg", "Flight Dequeued");
		modelMap.put("queue", flightControlService.dequeue());
		return "flight";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String getQueue(ModelMap modelMap) {
		modelMap.addAttribute("msg", "Queue");
		modelMap.put("queue", flightControlService.getQueue());
		return "flight";
	}
}