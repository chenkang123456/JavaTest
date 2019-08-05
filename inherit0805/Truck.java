package com.yueqian.inherit0805;

public class Truck extends Vehicle{
	
	private double cargo;
	
	

	public Truck(int passengers, double fuelcap, double mpg, double cargo) {
		super(passengers, fuelcap, mpg);
		this.cargo = cargo;
	}

	public double getCargo() {
		return cargo;
	}

	public void setCargo(double cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return super.toString()+"\t 运载能力：" + cargo;
	}
	
	

}
