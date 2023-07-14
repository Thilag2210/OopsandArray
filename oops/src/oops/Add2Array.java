package oops;
import java.util.Arrays;
import java.util.Scanner;
public class Add2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the 1st length:");
			int arrlength1=sc.nextInt();
			System.out.println("enter the 2nd length:");
			int arrlength2=sc.nextInt();
			int arrlength3=sc.nextInt();

			if(arrlength1!=arrlength2) {
				System.out.println("invalid array elements");
			}
			int arr1[]=new int[arrlength1];
			int arr2[]=new int[arrlength2];
			int arr3[]=new int[arrlength3];
			System.out.println("enter the value");
			for(int i=0;i<arr1.length;i++) {
				arr1[i]=sc.nextInt();
			}
			System.out.println("enter the value");

			for(int i=0;i<arr2.length;i++) {
				arr2[i]=sc.nextInt();
			}
			for(int i=0;i<arr3.length;i++) {
				arr3[i]=arr1[i]+arr2[i];
			}
			System.out.println("total"+ Arrays.toString(arr3));
			

	}

}
