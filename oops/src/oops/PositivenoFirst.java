package oops;
import java.util.Arrays;
public class PositivenoFirst {

	public static void main(String[] args) {
		int a[]= {-4,8,6,-5,6,-2,1,2,3,-11};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int b[]=new int [a.length];
		int j=a.length;
		for (int i = 0; i < a.length; i++) {
			b[j-1]=a[i];
			j--;
		}
		System.out.println("positive number First:");
		System.out.println(Arrays.toString(b));
		
	}

}
