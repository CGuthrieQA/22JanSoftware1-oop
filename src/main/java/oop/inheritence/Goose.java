package oop.inheritence;

public class Goose extends Bird{
	private int wingspan = 50;
	
	public void doSomething() {
		System.out.println("Wingspan: " + this.wingspan + ", Flight? " + super.getFly());
	}
}
