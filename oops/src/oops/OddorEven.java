package oops;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {64,75,54,25,98,22};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("This is even number"+a[i]);
			}else if(a[i]%2!=0)
			{
				System.out.println("odd number is "+a[i]);
			}
		}

	}

}
