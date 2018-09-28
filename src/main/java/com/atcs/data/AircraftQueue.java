package com.atcs.data;

import java.util.Date;

import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection = "AIRCRAFT_QUEUE")
public class AircraftQueue {

	@Id
	private Long id;

	private Aircraft aircraft;

	private Date arrivalDt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Aircraft getAircraft() {
		return aircraft;
	}

	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}

	public Date getArrivalDt() {
		return arrivalDt;
	}

	public void setArrivalDt(Date arrivalDt) {
		this.arrivalDt = arrivalDt;
	}

}
