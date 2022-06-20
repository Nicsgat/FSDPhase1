package IT;

import Admin.Animal;
import Admin.AnimalInterface;

public class Cat extends Animal implements AnimalInterface {
	//overridding 
	public void sound() {
		System.out.println("meow");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

}
