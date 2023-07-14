package oops;
import java.util.Iterator;
import java.util.Scanner;

public class Bet {

	public static void main(String[] args) {
			System.out.println("Welcome to 1xbet");
			Scanner sc=new Scanner(System.in);
			String loss; String win;
			int amount; double odd;
			
			for (int i = 1; i < 10; i++) {
				System.out.println("Enter the amount");
			 amount=sc.nextInt();
				System.out.println("Enter the odd");
				 odd=sc.nextDouble();
				 System.out.println("Enter the number :");
				 int n=sc.nextInt();
				 
				 switch(n) {
				 case 1: System.out.println("loss ");
				 int finalamount=0;
				 finalamount = finalamount+amount;
				 System.out.println("final loss value is:"+finalamount);
				 break;
				
				 case 2:System.out.println("win");
				 int total=(int) (amount*odd);
					System.out.println(total);
					break;
				 }
				 }
	}}
