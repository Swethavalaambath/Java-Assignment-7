package collectionsframework;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class LinkedlistExample {
	public static void main(String[] args) {

	List<String> animals = new LinkedList();

	animals.add("dog");
	animals.add("cat");
	animals.add("horse");

	for (String animal : animals) {
		System.out.println(animal);
	}

	animals.remove(1);

	

	Iterator<String> itr = animals.iterator();

	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
}

}


