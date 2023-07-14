package oops;

import java.util.Arrays;

public class CommonNumbers {

	public static void main(String[] args) {
		int Array1[]= {2,4,8};
		int Array2[]= {2,3,4,8,10,16};
		int Array3[]= {4,8,14,40};
		
		for(int i=0;i<Array2.length;i++) {
			for(int j=0;j<Array1.length;j++) {
				for(int k=0;k<Array3.length;k++) {
					
				if(Array2[i]==Array1[j]) {
					if(Array2[i]==Array3[k]) {
						int c=Array2[i];
					System.out.println(c);
					
				}
					
			}

		}
	}
		}
}}
