package com.atcs.service;

import java.util.Comparator;
import java.util.PriorityQueue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.atcs.data.Aircraft;

@Service
public class FlightControlService {
	PriorityQueue<Aircraft> atsQueue = new PriorityQueue<Aircraft>(10,
			Comparator.comparing(Aircraft::getAircraftType).thenComparing(Aircraft::getAircraftSize));

	private static final Logger logger = LogManager.getLogger(FlightControlService.class);

	public Aircraft dequeue(Aircraft aircraft) {
		Aircraft dequeuedAC = null;
		try {
			dequeuedAC = atsQueue.poll();
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return dequeuedAC;

	}

	public boolean enqueue(Aircraft aircraft) {
		boolean added = true;
		try {
			atsQueue.add(aircraft);
		} catch (Exception e) {
			added = false;
		}
		return added;
	}

}
