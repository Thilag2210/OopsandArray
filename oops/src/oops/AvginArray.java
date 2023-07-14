package oops;
import java.util.Scanner;

public class AvginArray {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Total subjects");
			int last=sc.nextInt();
			int arr[]=new int[last];
			int sum=0;
			System.out.println("Enter tha tamil,english ,maths,science and social marks:");
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
				sum+=arr[i];
			}
			double avg=sum/arr.length;
			System.out.println("my 10th percentage is:"+avg);
	}

}
