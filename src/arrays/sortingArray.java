package arrays;

import javax.security.auth.login.CredentialNotFoundException;

public class sortingArray {
	 public static void main(String[] args) {
		 int[] arr = {4,65,78,96,34,25,67,90,0};
			
		   for(int i =0; i< arr.length ;i++) {
			   for(int j = i+1; j<arr.length; j++) {
				   int temp=0;
				   if(arr[i]>arr[j]) {
					   temp= arr[i];
					   arr[i]=arr[j];
					   arr[j]=temp;
				   }
			   }
		   }
		   System.out.println("Ascending order :");
		   for(int i =0 ; i< arr.length ; i++) {
			   System.out.print( arr[i]+" ");
		   }
			

	 }
	
}
