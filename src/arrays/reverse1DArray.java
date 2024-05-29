package arrays;

public class reverse1DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] array = {1,2,3,4,5,6};
   
   int start=0;
   int end= array.length-1;
   
   while(start<end) {
	  
		   int temp = array[start];
		  array[start] = array[end];
		  array[end]=temp;
		  start++;
		  end--;
	   }
   for(int i=0 ; i<array.length ; i++) {
	   
	   System.out.print(array[i]+" ");
   }
   
   
	}

}
