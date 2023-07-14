package oops;
import java.util.Scanner;
public class SumofArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length");
		int len=sc.nextInt();
		int arr[]=new int[len];
		int sum=0;
		System.out.println("Enter the input from user:");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("The sum of value is"+sum);
		
		
	}

}
