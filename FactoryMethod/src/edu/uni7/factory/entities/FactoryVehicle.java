package edu.uni7.factory.entities;

public interface FactoryVehicle {
	
	Vehicle createVehicle();
	Vehicle createVehicle(String type);

}
