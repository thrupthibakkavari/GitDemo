
public class removingStringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String orginalString= "yeelow is yellow";
		String removedsubString = "is";
		
		String resultString= orginalString.replace(String.valueOf(removedsubString), "");
		 System.out.println(resultString);
		 
		 char removedchar ='e';
		 
		 String resltString1= orginalString.replace(String.valueOf(removedchar),"");
		 System.out.println(resltString1);
	}

}
