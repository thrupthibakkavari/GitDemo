package arrays;

import java.lang.foreign.AddressLayout;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Print2D {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[][]= {{2,3,3},{3,4,3}};
		
		for(int i=0; i<array.length; i++) {
			for(int j =0 ; j<array[i].length ; j++) {
				System.out.print(array[i][j] +" ");
			}
		
				System.out.println();
			}
}}



