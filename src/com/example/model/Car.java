package com.example.model;

public class Car extends Vehicle{
	private int numSeats;
	private String carType;
	
	public Car(String name,String model,String licenseNumber,String pricePerDay,int numOfSeats,String carType) {
		this.numSeats = numOfSeats;
		this.carType = carType;
		super.setOwnerName(name);
		super.setLicenseNumber(licenseNumber);
		super.setModel(model);
		super.setPricePerDay(pricePerDay);
	}
	public int getNumSeats() {
		return numSeats;
	}
	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
}
