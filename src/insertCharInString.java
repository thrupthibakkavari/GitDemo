
public class insertCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="yellow";
		char ch = 'c';
		int pos =4;
		StringBuilder sting = new StringBuilder(str);
		
		sting.insert(pos, 'c'); //add the char at the given index 
		
//		sting.setCharAt(pos, ch); // replace exiting char in the giving index
		
		System.out.println(sting);
		
		

	}

}
