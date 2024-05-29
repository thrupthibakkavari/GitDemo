package sorting;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class sortingAscDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list = new LinkedList<String>();
        
        list.add("ellie");
        list.add("michael");
        list.add("john");
        
        Collections.sort(list, Collections.reverseOrder());
        
        System.out.println("Descending order");
        for (String i: list) {
        	System.out.println(i);
        }
        
        Collections.sort(list);
        for (String i: list) {
        	System.out.println(i);
        }
	}

}
