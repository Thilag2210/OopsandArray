package oops;
import java.util.Arrays;

public class ReverseanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {65,75,55,25,98,22};
		int b[]=new int[a.length];
		int j=a.length;
		for(int i=0;i<a.length;i++) {
			b[j-1]=a[i];
			j--;
		}
		System.out.println("Reverse a array is :"+ Arrays.toString(b));
	}

}
