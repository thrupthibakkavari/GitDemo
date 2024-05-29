
public class reverseString {

	public static void main(String[] args) {
		
		String string = "YELLOW";
		String str ="";
		
		
		for (int i=0 ; i< string.length(); i++) {
			
			str =string.charAt(i)+str;
			
			
		}
		
     System.out.println(str);
	}

}
