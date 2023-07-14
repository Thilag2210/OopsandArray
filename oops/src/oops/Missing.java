package oops;

public class Missing {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,6,7};
		int sum=0;
		for(int i=1;i<=7;i++ ) {
			sum=sum+i;
		}
	int	sum1=0;
		for(int i=0;i<a.length;i++ ) {
			sum1=sum1+a[i];
		}
		int m=sum-sum1;
		System.out.println("missing number is :"+m);
	}

}
