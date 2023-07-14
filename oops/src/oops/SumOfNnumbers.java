package oops;
import java.util.Scanner;
public class SumOfNnumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth value:");
		int n=sc.nextInt();
		int sum=n*(n+1)/2;
		System.out.println("Sum of all digits up to nth value: "+sum);

	}

}
