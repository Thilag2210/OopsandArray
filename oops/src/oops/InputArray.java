package oops;
import java.util.Scanner;

public class InputArray {

	public static void main(String[] args) {
			int a[]=new int[5];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the array values :");
			for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
				
			}
			System.out.println();
	}

}
