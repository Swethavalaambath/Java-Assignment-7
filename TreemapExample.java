package collectionsframework;
import java.util.*;
import java.util.Iterator;
import java.util.TreeMap;

public class TreemapExample{
	public static void main(String[]args) {
TreeMap<Integer,String> m = new TreeMap<Integer,String>();
m.put(1,"PHP");
m.put(2,"jQuery");
m.put(3,"JavaScript");
m.put(4,"Ruby");
m.put(5,"Java");
m.put(6,"AngularJS");
m.put(7,"ExpressJS");
System.out.println("TreeMap Elements...");
Collection res = m.values();
Iterator i = res.iterator();
while (i.hasNext()) {
   System.out.println(i.next());
}
System.out.println("TreeMap size = "+m.size());

 m.remove(5);
System.out.println("\nTreeMap after removing a single element...\n "+m);
System.out.println("Size of TreeMap now = "+m.size());
}}
	
	