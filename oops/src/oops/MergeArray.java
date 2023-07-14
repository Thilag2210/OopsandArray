package oops;
import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[]= {10,15,20,25};
			int b[]= {50,55,12};
			int p=0;
			int c[]=new int[a.length+b.length];
			for(int i=0;i<a.length;i++) {
				c[p]=a[i];
				p++;
			}
			for(int i=0;i<b.length;i++) {
				c[p]=b[i];
				p++;
			}
			Arrays.sort(c);
			for(int j:c) {
				System.out.println(j);
			}
			System.out.println("merge of 2 array is:"+Arrays.toString(c));
	}

}
