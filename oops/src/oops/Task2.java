package oops;
import java.util.Arrays;
public class Task2 {

	public static void main(String[] args) {
		int a[]= {2,3,5,7,-7,5,8,-5};
		
		int g=a[0];
		for(int i=0;i<a.length;i++) {
			if(g<a[i]) {
				g=a[i];
			}

		}
		System.out.println("The greatest element in an array "+g);
		Arrays.sort(a);
		System.out.println("Second largest element is "+a[a.length-2]);
		int mul=g*a[a.length-2];
		System.out.println("product of two value is "+mul);
		
	}

}
