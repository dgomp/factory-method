package edu.uni7.factory.aplication;

import edu.uni7.factory.entities.FactoryBike;
import edu.uni7.factory.entities.FactoryCar;
import edu.uni7.factory.entities.Vehicle;
import edu.uni7.*;


public class Aplication {
	public static void main(String[] args) {

		FactoryBike factoryBike = new FactoryBike();
		FactoryCar factoryCar = new FactoryCar();

		Vehicle car =  factoryCar.createVehicle();
		Vehicle bike = factoryBike.createVehicle();
		Vehicle bikeScooter = factoryBike.createVehicle("Scooter");
		
		car.showObject();
		bike.showObject();
		
		bikeScooter.showObject();
		
		
	}
	
	
		
	
	
	
	
}
