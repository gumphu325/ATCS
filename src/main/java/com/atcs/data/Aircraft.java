package com.atcs.data;

import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection = "AIRCRAFT")
public class Aircraft {

	@Id
	private Long id;

	private String aircraftName;

	private AircraftType aircraftType;

	private AircraftSize aircraftSize;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAircraftName() {
		return aircraftName;
	}

	public void setAircraftName(String aircraftName) {
		this.aircraftName = aircraftName;
	}

	public AircraftType getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(AircraftType aircraftType) {
		this.aircraftType = aircraftType;
	}

	public AircraftSize getAircraftSize() {
		return aircraftSize;
	}

	public void setAircraftSize(AircraftSize aircraftSize) {
		this.aircraftSize = aircraftSize;
	}
}
