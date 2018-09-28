package com.atcs.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.atcs.data.Aircraft;

@Service
public class FlightControlService {
	PriorityBlockingQueue<Aircraft> atsQueue = new PriorityBlockingQueue<Aircraft>(10,
			Comparator.comparing(Aircraft::getAircraftType).thenComparing(Aircraft::getAircraftSize));

	private static final Logger logger = LogManager.getLogger(FlightControlService.class);

	public List<Aircraft> dequeue() {
		Aircraft aircraft = null;
		try {
			aircraft = atsQueue.poll();
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return new ArrayList<>(atsQueue);

	}

	public List<Aircraft> enqueue(Aircraft aircraft) {
		try {
			atsQueue.add(aircraft);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return new ArrayList<>(atsQueue);
	}

	public List<Aircraft> getQueue() {
		return new ArrayList<>(atsQueue);
	}

}
