package oops;
import java.util.Scanner;
public class Oneto100withoutFor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to start:");
		int i=sc.nextInt();
		System.out.println("Enter the End value:");
		int n=sc.nextInt();
		
		while(i<n) {
			if(i%2==0) {
			System.out.println(i);
			}
			i++;
		}}
	}


