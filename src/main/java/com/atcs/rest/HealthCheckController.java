package com.atcs.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HealthCheckController {

	@RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
	public String healthCheck() {
		return "healthcheck";
	}

}
