package com.example.model;

public class Vehicle {
	private String ownerName;
	private String model;
	private String licenseNumber;
	private String pricePerDay;
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getPricePerDay() {
		return pricePerDay;
	}
	public void setPricePerDay(String pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
}
