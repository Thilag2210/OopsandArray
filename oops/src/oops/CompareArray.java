package oops;

public class CompareArray {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		int b[]= {10,20,30};
		int c[]= {11,12,13};
		int d[]=a;
		if(a==b) {
			System.out.println("equal");
		}else
			System.out.println("not");
		if(a==c) {
			System.out.println("equal");
		}else
			System.out.println("not");
		if(a==b) {
			System.out.println("equal");
		}else
			System.out.println("not");
	}

}
