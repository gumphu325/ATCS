package com.atcs.service;

import java.util.Comparator;

import com.atcs.data.Aircraft;

public class AircraftComparator implements Comparator<Aircraft> {

	@Override
	public int compare(Aircraft o1, Aircraft o2) {
		// TODO Auto-generated method stub
		Comparator.comparing(Aircraft::getAircraftType).thenComparing(Aircraft::getAircraftSize);
		return 0;
	}

}
