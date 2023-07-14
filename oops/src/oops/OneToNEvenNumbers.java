package oops;
import java.util.Scanner;
class A{
void one(int s) {
	if(s<=100) {
		//System.out.print(s+" ");
		s++;
		if(s%2==0) {
			System.out.print(s+" ");
		}
		one(s);
	}
}}
public class OneToNEvenNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start value:");
		int s=sc.nextInt();
		A a=new A();
		a.one(s);
		
	}

}
