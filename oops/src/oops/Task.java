package oops;
import java.util.Arrays;

public class Task {

	public static void main(String[] args) {
		int a[]= {0,0,1,1,0,1,1,1,0};
		System.out.println("original Array:");
	

		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("New Array:");

		System.out.println(Arrays.toString(a));

		

	}

}
