
public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     String originalString = "Hello, Welcome To PrepBytes!!!";
	        String modifiedString = "";
	        for (int i = 0; i < originalString.length(); i++) {
	            char currentChar = originalString.charAt(i);
	            // Check if the current character is a vowel
	            if (!isVowel(currentChar)) {
	                modifiedString += currentChar;
	            }
	        }
	        System.out.println("Modified string: " + modifiedString);
	    }

	private static boolean isVowel(char currentChar) {
		// TODO Auto-generated method stub
		
		currentChar = Character.toLowerCase(currentChar);
		
		return currentChar =='a' ||currentChar =='e'||currentChar =='i'||currentChar =='o'||currentChar =='u';
	}

	

}
