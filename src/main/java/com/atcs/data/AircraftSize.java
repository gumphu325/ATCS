package com.atcs.data;

public enum AircraftSize {

	LARGE(1), SMALL(2);

	private final int priority;

	AircraftSize(int priority) {
		this.priority = priority;
	}

	public int getPriority() {
		return priority;
	}

}
