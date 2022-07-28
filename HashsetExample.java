package collectionsframework;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetExample {



	public static void main(String[] args) {

		Set<String> animals = new HashSet();

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

