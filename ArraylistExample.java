package collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistExample {
	
	public static void main (String[] args) {
		List<String>animals=new ArrayList<String>();
		animals.add("cat");
		animals.add("dog");
		animals.add("horse");
		animals.add("pig");
		
		System.out.println(animals);
		
		
		Iterator<String>itr=animals.iterator();
		while (itr.hasNext()) {String animal=itr.next();
			
		if(animal.equals("horse"))
			{itr.remove();
			}
			
		}
		
		System.out.println(animals);
	}}
	

