package ListS;


import java.nio.channels.NoConnectionPendingException;
import java.util.*;


public class LinkedList {

	public static void main(String[] args) {
		
		List <String> list = new java.util.LinkedList<String>();
		 list.add("Belgium");
		 list.add("Sydney");
		 list.add("Beijing");
		 list.add("HongKong");
		 list.add("LA");
		 list.add("San Fanscico");
		// TODO Auto-generated method stub
		 System.out.println("Acualt List :"+list);
		 
		 list.add(3,"New York");
		 System.out.println( "Updated List:"+ list );
		 
		 list.set(4, "mascow");
		 System.out.println( "Updated List:"+ list );
		 
		 System.out.println("Fetching data at index 6 :"+ list.get(6));
		
		 List<String> list1= new java.util.LinkedList<String>();
		 list.add("Monoco");
		 list.add("Signapur");
		 list.add("Malayisa");
		 list.add("Dubai");
		 
		 list.addAll(list1);
		 System.out.println( "Updated List (adding to collects):"+ list );
		 
//		 list.retainAll(list1);
//		 System.out.println( "Updated List (removing to collects):"+ list );
		 
		 list.remove(4);
		 System.out.println( "Remove the element at index List:"+ list );
		 
		 list.addFirst("Italy");
		 System.out.println( "Adding the elemet at the beging List:"+ list );
		 
		 
		 
		 list.addLast("Italy");
		 System.out.println( " Last the elemet at the last List:"+ list );
		 
		 list.removeAll(list1);
		 System.out.println("remove all of list 1 from List"+list);
		 
		 ((java.util.LinkedList<String>) list).removeFirstOccurrence("Italy");
		 System.out.println("remove first occurance of ittaly from List"+list);
		 
		 
		 list.addLast("Italy");
		 System.out.println( " Last the elemet at the last List:"+ list );
		 
		 ((java.util.LinkedList<String>) list).removeLastOccurrence("Italy");
		 System.out.println("remove Last occurance of ittaly from List"+list);
		 
		 System.out.println(" in forward order");
		 ListIterator<String> itrIterator = list.listIterator();
		 
		 
		 while(itrIterator.hasNext()) {
			 System.out.println(itrIterator.next());
		 }
		 
		 System.out.println(" in Reverse order");
		 ListIterator<String> itr = list.listIterator(list.size()); /// always use list.size in the listIterator to reverse order
		 
		  while(itr.hasPrevious()) {
			  
			  System.out.println(itr.previous());
		  }
		  
	}

}
