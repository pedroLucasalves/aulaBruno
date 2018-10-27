package model;

import lombok.Builder;

public class Car  extends DefaultModel{
	
	protected String manufacturer;
	
	protected String model;
	
	protected String motor;
	
	@Builder
	public Car(String manufacturer, String model, String motor, Integer id) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.motor = motor;
		this.id = id;
	}

}
