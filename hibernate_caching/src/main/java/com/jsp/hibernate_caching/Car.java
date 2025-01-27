package com.jsp.hibernate_caching;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	
	@Id
	private int carId;
	private String carBrand;
	
	
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
//	@Override
//	public String toString() {
//		return "Car [carId=" + carId + ", carBrand=" + carBrand + "]";
//	}
	
	

}
