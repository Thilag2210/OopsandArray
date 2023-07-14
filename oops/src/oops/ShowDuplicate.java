package oops;
import java.util.Arrays;
import java.util.Scanner;
public class ShowDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {10,10,20,30,30,40};
	
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
