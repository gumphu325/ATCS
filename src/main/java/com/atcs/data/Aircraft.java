package com.atcs.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Aircraft")
public class Aircraft {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private AircraftType aircraftType;

	private AircraftSize aircraftSize;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
