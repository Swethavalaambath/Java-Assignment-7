package collectionsframework;

import java.util.Vector;
import java.util.Iterator;

public class VectorExample {
	
	

		public static void main(String[] args) {

			Vector<String> v = new Vector();
			v.add("dog");
			v.add("Cat");
			v.add("Pig");

			for (String str : v) {
				System.out.println(str);
			}
			v.remove("Pig");
			
			 Iterator it = v.iterator();

		     System.out.println("Vector elements are:");
		     while(it.hasNext()){
		       System.out.println(it.next());}
		     }}
			


