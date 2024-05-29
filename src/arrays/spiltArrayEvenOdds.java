package arrays;

import java.util.Arrays;

public class spiltArrayEvenOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,3,4,5,6};
 int evenCount = 0;
 int oddCount=0;

 for(int i: arr) {
	if (i%2==0) {
		evenCount++;
	}
	else {
		oddCount++;
	}
}
  int[] evenArray=new int[evenCount];
  int[] oddArray=new int[oddCount];
  int evenIndex=0;
  int oddIndex=0;
  for(int i :arr) {
	  if (i%2==0) {
		  evenArray [evenIndex++]=i;
		}
		else {
			oddArray [oddIndex++]=i;
		}
	  
  }
  
  System.out.println(Arrays.toString(evenArray));
	}

}
