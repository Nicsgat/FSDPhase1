package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
	
		arraylist.add(12);
		arraylist.add(22);
		arraylist.add(32);
		arraylist.add(42);
		arraylist.add(52);
		arraylist.set(3,79);
		
		System.out.println(arraylist);
		
		arraylist.remove(3);
		System.out.println(arraylist);
		
		arraylist.add(2,88);
		System.out.println(arraylist);
		
		System.out.println(arraylist.size());
		
		Integer i;
		
		for (i=0; i< arraylist.size();i++) {
			System.out.println(arraylist.get(i));
		}
		
		Iterator it= arraylist.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			break;   
		}
		
		
		
		
		
		
		
	}

}
