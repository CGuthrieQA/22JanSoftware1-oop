package oop.abstraction;

public class Goose implements Hatchable, Flyable{

	@Override
	public void hatch() {
		System.out.println("Cracking egg...");
		
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Flapping wings...");
	}

}
