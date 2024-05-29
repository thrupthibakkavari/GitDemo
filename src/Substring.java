
public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		
//		 String OriString= "Thrupthi Maheswari";
//	        String insertedString ="Durga";
//	        int index= 8;
//	       
//	        System.out.println(OriString.substring(0,index+1)+ insertedString + " " +OriString.substring(index+1) );
		
		
//		String originalString = "Hello World";
//		StringBuilder stringBuilder = new StringBuilder(originalString);
//		int startIndex = originalString.indexOf("World");
//		int endIndex = startIndex + "World".length();
//		stringBuilder.delete(startIndex, endIndex);
//		
//		System.out.println(stringBuilder);
//		System.out.println("World".length());
		String originalString = "Hello World";
		String substringToRemove = "World";
		String resultString = originalString.replaceAll(substringToRemove, "");
		System.out.println(resultString);
	}

}
