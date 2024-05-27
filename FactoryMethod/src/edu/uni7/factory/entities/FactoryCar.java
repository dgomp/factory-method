package edu.uni7.factory.entities;

public class FactoryCar implements FactoryVehicle {

	@Override
	public Vehicle createVehicle() {
		
		return new Car();
	}

	@Override
	public Vehicle createVehicle(String type) {
		if (type.equalsIgnoreCase("SUV")) {
            return new CarSuv();
        } else if (type.equalsIgnoreCase("Sedan")) {
            return new CarSedan();
        } else if (type.equalsIgnoreCase("Hatch")) {
            return new CarHatch();
        } else {
            throw new IllegalArgumentException("Tipo de carro desconhecido.");
        }
	}

}
