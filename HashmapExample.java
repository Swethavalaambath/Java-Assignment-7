package collectionsframework;
import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapExample {
	public static void main(String[]args) {
	
    HashMap<Integer, String>map = new HashMap();

 
    map.put(1,"name1");
    map.put(2,"name2");
    map.put(3,"name3");

   
    int keyToBeRemoved = 2;

    
    System.out.println("Original HashMap: "
                       + map);

   
    Iterator<Map.Entry<Integer, String> >
        iterator = map.entrySet().iterator();

    
    while (iterator.hasNext()) {

      
        Map.Entry<Integer, String>
            entry
            = iterator.next();

        
        if (keyToBeRemoved == entry.getKey()) {

           
            iterator.remove();
        }
    }

    
    System.out.println("Modified HashMap: "
                       + map);
}
}


