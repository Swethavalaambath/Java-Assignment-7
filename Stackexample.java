package collectionsframework;
import java.util.Stack;
import java.util.Iterator;
public class Stackexample {
	public static void main(String[] args) {

		Stack<String> animals = new Stack();
		
		animals.push("dog");
		animals.push("cat");
		animals.push("dolphin");
		
		System.out.println(animals);
		
		
		
		System.out.println(animals.pop());
		System.out.println(animals.pop());
		
		System.out.println(animals);
		
		Iterator animal = animals.iterator();
		  
        
        System.out.println("The iterator values are: ");
        while (animal.hasNext()) {
            System.out.println(animal.next());
        }
   

}}
