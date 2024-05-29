

package ListS;
import java.util.*;


public class addingElements {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<String>();
		
		   list.add("ads");
		      list.add("ddf");
		      list.add("kjufdb");
		      
		      list.add(2,"hbfruh"); /// to add perticular element at index 
		      
		      
		      for(String ele :list)
		      System.out.println(ele);
		      
		      
		      System.out.println(list.size()); //give the size of list
		// TODO Auto-generated method stub
		      System.out.println("");
		      
		      list.set(3,"uhsdygcsdvhsj");/// replace the element at the index with new element
		      
		      for(String lang :list)
			      System.out.println(lang);
		      
		      System.out.println("");
		      
		      System.out.println(list.get(3));// to print perticular elemts from the list
	}

}
