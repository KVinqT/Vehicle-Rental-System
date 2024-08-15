package com.example.service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.model.Car;


public class CarService extends VehicleService{
	BufferedReader inputReader = new BufferedReader((new InputStreamReader(System.in)));
	@Override
	public void addVehicle() throws IOException {
		System.out.print("Enter owner name: ");
		String name = inputReader.readLine();
		System.out.print("Enter model name: ");
		String model = inputReader.readLine();
		System.out.print("Enter license number: ");
		String licenseNumber = inputReader.readLine();
		System.out.print("Enter price per day: ");
		String pricePerDay = inputReader.readLine();
		System.out.print("Enter numer of seats: ");
		int numOfSeats = inputReader.read();
		System.out.print("Enter type of car: ");
		String carType = inputReader.readLine();
		Car car = new Car(name,model,licenseNumber,pricePerDay,numOfSeats,carType);
		System.out.println("Owner" + " " + car.getOwnerName() + "car is successfully registered to the list")
	}	
	
}
