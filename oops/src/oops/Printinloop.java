package oops;
import java.util.Scanner;

public class Printinloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array length");
		int length=sc.nextInt();
		int arr[]=new int [length];
		System.out.println("Enter the input value:");
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("the input values are");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
