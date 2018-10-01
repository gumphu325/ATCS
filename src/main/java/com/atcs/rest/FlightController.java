package com.atcs.rest;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

	private static final Logger logger = LogManager.getLogger(FlightController.class);
	@Autowired
	FlightControlService flightControlService;

	@RequestMapping(path = "land", method = RequestMethod.POST)
	public String enqueueFlight(@RequestBody List<Aircraft> aircrafts, ModelMap modelMap) {
		modelMap.addAttribute("msg", "Flight Enqueued");
		modelMap.put("queue", flightControlService.enqueue(aircrafts));
		logger.info("Successfully landed !!!");
		return "flight";
	}

	@RequestMapping(path = "fly", method = RequestMethod.PUT)
	public String dequeueFlight(ModelMap modelMap) {
		modelMap.addAttribute("msg", "Flight Dequeued");
		modelMap.put("queue", flightControlService.dequeue());
		logger.info("Successfully flew !!!");
		return "flight";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String getQueue(ModelMap modelMap) {
		modelMap.addAttribute("msg", "Queue");
		modelMap.put("queue", flightControlService.getQueue());
		logger.info("Successfully returned the queue info !!!");
		return "flight";
	}
}