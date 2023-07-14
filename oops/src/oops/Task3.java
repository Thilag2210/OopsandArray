package oops;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		int[] A= {1,5,6,7,8,10};
		int B[]= {2,4,9};
		int A1=A.length;
		int B1=B.length;
		int j=0;

		int[] C=new int[A1+B1];
		int[] D=new int[A1+B1];

		System.arraycopy(A, 0, C, 0, A1);
		System.arraycopy(B, 0, C, A1, B1);
		System.out.println(Arrays.toString(C));
		Arrays.sort(C);
		System.out.println(Arrays.toString(C));
		
		for (int i = 0; i < C.length; i++) {
			D[j]=C[i];
			j++;
		}
		System.out.println(D);
		System.out.println(Arrays.toString(D));
		int e[]=new int[A.length];
		int d=0;
		for(int i=0;i<A.length;i++)
		{
			e[d]=D[i];
			d++;
		}
		System.out.println(Arrays.toString(e));
		int a[]=new int [B.length];
		int g=0;
		for(int i=0;i<B.length;i++)
		{
			a[g]=D[d];
			d++;
			g++;
		}
		
		System.out.println(Arrays.toString(a));

	}

}
