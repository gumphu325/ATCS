package com.atcs.data;

public enum AircraftType {

	EMERGENCY(1), VIP(2), PASSENGER(3), CARGO(4);

	private final int priority;

	AircraftType(int priority) {
		this.priority = priority;
	}

	public int getPriority() {
		return priority;
	}

}
