
public class StringintoString {
	   public static String StringInserted(String OriString, String insertedString , int index){
	        
	        String newString = new String();
	        
	        for (int i=0; i< OriString.length(); i++){
	            
	            newString+=OriString.charAt(i);
	              
	            if(i==index){
	                newString+=insertedString;
	            }
	        }
	        
	        
	        return newString;
	    }
	    
	    public static void main(String[] args) {
	        
	        String OriString= "Thrupthi Maheswari";
	        String insertedString ="Durga";
	        int index= 8;
	        System.out.println(StringInserted(OriString,insertedString,index));
	    }
	}