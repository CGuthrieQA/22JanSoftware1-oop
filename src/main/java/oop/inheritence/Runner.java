package oop.inheritence;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goose bigGoose = new Goose();
		bigGoose.doSomething();
		Chicken CluckNorris = new Chicken();
		CluckNorris.doSomething();
		CluckNorris.cluck();
		CluckNorris.noise();
		bigGoose.noise();
	}

}
