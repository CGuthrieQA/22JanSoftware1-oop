package oop.polymorphism;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chicken chicken = new Chicken();
		Animal animal = new Chicken();
		Object object = new Chicken();
		
		System.out.println("------Chicken-------");
		chicken.speak();
		chicken.sleep();
		System.out.println("------Animal-------");
		((Chicken) animal).speak();
		((Chicken) animal).sleep();
		System.out.println("------Object-------");
		((Chicken) object).speak();
		((Chicken) object).sleep();
	}
}
