package arrays;

public class arrayLargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[]{10,20,9457,764,97}; 
		int max =arr[0];
		int i ;
		for (i= 1; i<arr.length; i++)
		{
			if (arr[i]>max)
				max=arr[i];
			
		}
		int min=arr[0];
		for(i=0 ; i<arr.length ;i++) {
			if (arr[i]<min)
				min= arr[i];
		}
		System.out.println(max);
System.out.println(min);
	}

}
