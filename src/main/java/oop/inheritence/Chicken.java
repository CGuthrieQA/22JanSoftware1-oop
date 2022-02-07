package oop.inheritence;

public class Chicken extends Bird{
	private int eggCount = 0;
	
	public void doSomething() {
		System.out.println("Flight? " + super.getFly());
	}
	
	public int getEggCount() {
		return eggCount;
	}
	
	public void setEggCount(int eggs) {
		this.eggCount = eggs;
	}
	
	public void cluck() {
		System.out.println("bwark!");
	}
}
