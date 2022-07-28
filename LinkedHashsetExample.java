package collectionsframework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashsetExample {
	



		public static void main(String[] args) {

			Set<String> animals = new LinkedHashSet();

			animals.add("dog");
			animals.add("cat");
			animals.add("dolphin");

			
				System.out.println(animals);
			

			animals.remove("cat");

			Iterator<String> itr = animals.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}

		}

	}


