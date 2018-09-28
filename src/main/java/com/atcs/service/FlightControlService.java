package com.atcs.service;

import java.util.Comparator;

import org.springframework.stereotype.Service;

import com.atcs.data.Aircraft;

@Service
public class FlightControlService {

	public Comparator<Aircraft> dequeue(Aircraft aircraft) {
		return Comparator.comparing(Aircraft::getAircraftType).thenComparing(Aircraft::getAircraftSize);
	}

	public boolean enqueue(Aircraft aircraft) {
		
		return false;

	}

}
