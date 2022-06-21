package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> animal = new LinkedList<String>();
		

		 animal.add("Dog"); animal.add("Cat"); animal.add("Lion");
		

		System.out.println(animal.size());
		System.out.println(animal);
		System.out.println(animal.remove(1));
		System.out.println(animal);
		System.out.println(animal.peek());

		
		Queue<String> animal1 = new LinkedList<String>();
		
		
		animal1.add("Dog1");
		animal1.add("Cat1");
		animal1.add("Lion1");
		System.out.println(animal1);
		/*
		 * System.out.println(animal1.remove(1)); System.out.println(animal1);
		 */
		System.out.println(animal1.poll());
		System.out.println(animal1.peek());
		System.out.println(animal1);
		
		
	}

}
