package com.atcs.data;

public enum AircraftSize {

	SMALL(1), LARGE(2);

	private final int priority;

	AircraftSize(int priority) {
		this.priority = priority;
	}

	public int getPriority() {
		return priority;
	}

}
