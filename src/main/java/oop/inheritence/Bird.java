package oop.inheritence;

public class Bird {
	
	private boolean fly = true;
	
	public void noise() {
		System.out.println("tweet");
	}
	
	public boolean getFly() {
		return fly;
	}
	
	public void setFly(boolean canFly) {
		this .fly = canFly;
	}
	
}
