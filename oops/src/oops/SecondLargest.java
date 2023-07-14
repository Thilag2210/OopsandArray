package oops;
import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int a[]= {65,75,55,25,98,22};
		Arrays.sort(a);
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a[a.length-2]);
	}

}
