package IT;

import Admin.Animal;
import Admin.AnimalInterface;

public class RunnerClass {

	public static void main(String[] args) {
		//second second = new second();
		//second.setValue();

		Animal obj = new Dog();
		
		//here obj is reference variable
		//it can be assigned object to child class
		//this is call as dynamic despatch 
		
		obj.eat();
		
		AnimalInterface obj1= new Cat();
		obj1.sound();
	}

}