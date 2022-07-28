package collectionsframework;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetExample {public static void main(String[] args) {

	Set<String> animals = new TreeSet();

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


