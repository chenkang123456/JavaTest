package com.enumtext0813;


public class TestAnimals {
	public static void main(String[] args){
		
	Animals[] animals=Animals.values();
	for(int i=0;i<animals.length;i++){
		System.out.println(animals[i]);
	}
  }
}

enum Animals {
	PIG("pig",12),
	DOG("dog",11);
	private String animalName;
	private int animalNumber;
	
	private Animals(String animalName,int animalNumber){
		this.animalName = animalName;
		this.animalNumber = animalNumber;
	}
	
	public String getAnimalName(){
		return animalName;
	}
	public int getAnimalNumber(){
		return animalNumber;
	}
	@Override
	public String toString() {
		return "Animals [animalName=" + animalName + ", animalNumber=" + animalNumber + "]";
	}
	public void show(){
		System.out.println("");
	}
}