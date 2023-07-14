package oops;
import java.util.Scanner;
public class ThreeDArrayAdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][][]=new int[2][2][2];
		int b[][][]=new int [2][2][2];
		int c[][][]=new int [2][2][2];
		int d[][][]=new int [2][2][2];
		System.out.print("Enter the 1st data");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < c.length; k++) {
					a[i][j][k]=sc.nextInt();
			}
			}
		}
		System.out.print("Enter the 2nd data");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k= 0; k < c.length; k++) {

				b[i][j][k]=sc.nextInt();
			}}
			
		}
		System.out.print("Enter the 3rd data");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < c.length; k++) {

				c[i][j][k]=sc.nextInt();
			}}
			
		}
		System.out.print("Enter the 1st matrices");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < c.length; k++) {

				System.out.print(a[i][j][k]+" ");
			}
			System.out.print("\n");
			}}
		System.out.print("Enter the 2nd matrices");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k< c.length; k++) {

				System.out.print(b[i][j][k]+" ");
			}
			System.out.print("\n");
			}}
		System.out.print("Enter the 3rd matrices");
				for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k< c.length; k++) {

				System.out.print(c[i][j][k]+" ");
			}
			System.out.print("\n");
			}}
				System.out.println("Sum of matrices");

				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < b.length; j++) {
						for (int k = 0; k< c.length; k++) {

						d[i][j][k]=a[i][j][k]+b[i][j][k]+c[i][j][k];
						System.out.print(d[i][j][k]+" ");
					}
					System.out.print("\n");
					}
		
	}}

}
