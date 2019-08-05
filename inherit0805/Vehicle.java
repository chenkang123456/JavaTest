package com.yueqian.inherit0805;

public class Vehicle {
	private int Passengers;
	private double fuelcap;
	private double mpg;
	
	
	public Vehicle(int passengers, double fuelcap, double mpg) {
		super();
		this.Passengers = passengers;
		this.fuelcap = fuelcap;
		this.mpg = mpg;
	}
	public int getPassengers() {
		return Passengers;
	}
	public void setPassengers(int passengers) {
		this.Passengers = passengers;
	}
	public double getFuelcap() {
		return fuelcap;
	}
	public void setFuelcap(double fuelcap) {
		this.fuelcap = fuelcap;
	}
	public double getMpg() {
		return mpg;
	}
	public void setMpg(double mpg) {
		this.mpg = mpg;
	}
	@Override
	public String toString() {
		return  "载客量：" + Passengers + 
			    "油箱量：" + fuelcap + 
				"单位油耗：" + mpg;
	}
	
	
	
	

}
