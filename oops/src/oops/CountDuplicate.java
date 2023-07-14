package oops;

public class CountDuplicate {

	public static void main(String[] args) {
		int a[]= {20,20,30,40,50,50,50};
		int count=0;
		System.out.println("Original array length  "+a.length);
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
				
			}
		}
		System.out.println("The new length of the array is  "+count);

	}

}
