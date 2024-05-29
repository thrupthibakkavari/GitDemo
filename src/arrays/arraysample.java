package arrays;

public class arraysample {

	public static void main(String[] args) {
		
		char arr1[] = {'a','b','c'};
		char arr2[] = {'d','e','f'};
		
		for(int i=0 ;i<arr1.length ; i++) {
			for(int j =0; j<arr2.length; j++) {
				   System.out.print(arr1[i]+""+arr2[j]+" ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
