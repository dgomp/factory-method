package edu.uni7.factory.entities;

public class FactoryBike implements FactoryVehicle {

	@Override
	public Vehicle createVehicle() {
		
		return new Bike();
	}
	public Vehicle createVehicle(String type) {	
		
		  if (type.equalsIgnoreCase("Trail")) {
	            return new BikeTrail();
	        } else if (type.equalsIgnoreCase("Naked")) {
	            return new BikeNaked();
	        } else if (type.equalsIgnoreCase("Scooter")) {
	            return new BikeScooter();
	        } else {
	            throw new IllegalArgumentException("Motorcycle type not known");
	        }
		
	}

}
