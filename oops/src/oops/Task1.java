package oops;
import java.util.Arrays;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int a[]= {1789,2035,1899,1456,2013,1458,2458,1254,1472,2365,1456,2165,1457,2456};
		String b[]= {"Java","Python","PHP","C#","C","C++"};
				System.out.println("original Numeric Array:");
		for(int i:a) {
			System.out.println();
			break;
		}

		for(String j:b) {
			System.out.println();
			break;
		}
		System.out.println(Arrays.toString(a));
		System.out.println("original String Array:");

		System.out.println(Arrays.toString(b));

		Arrays.sort(a);
		System.out.println(" sorted Numeric Array:");

		System.out.println(Arrays.toString(a));
		Arrays.sort(b);
		System.out.println("Sorted String  Array:");

		System.out.println(Arrays.toString(b));
		
	}

}
