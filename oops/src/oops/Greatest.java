package oops;

public class Greatest {

	public static void main(String[] args) {
		int a[]= {65,75,55,25,98,22};
		int g=a[0];
		for(int i=0;i<a.length;i++) {
			if(g<a[i]) {
				g=a[i];
			}

		}
		System.out.println("The greatest element in an array"+g);

	}

}
