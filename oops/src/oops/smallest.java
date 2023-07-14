package oops;

public class smallest {

	public static void main(String[] args) {
		int a[]= {55,23,12,11,5,98};
		int s=a[0];
		for (int i=0;i<a.length;i++) {
				if(s>a[i]) {
				s=a[i];
			
			}
		}
		System.out.println("The smallest element in an array is:"+s);

	}

}
