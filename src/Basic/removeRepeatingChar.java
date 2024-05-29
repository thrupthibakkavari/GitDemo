package Basic;

public class removeRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string= "Geeksforgeeks";
		
		String nString="";
		
		for (int i =0 ; i<string.length(); i++)
		{
			if(nString.indexOf(string.charAt(i))== -1)
					{
				nString+=string.charAt(i);
				
			}
			
			
		}
System.out.println(nString);
	}

}
