import java.util.*;
class A3//copying the arrray
{
	public static void main(String[] args) 
	{
		int[]a={1,2,3,4};
		ans(a);
	}
	public static void ans(int[]x)
	{
		int[]b=new int[x.length];
		for (int i=0;i<x.length ;i++ )
		{
			b[i]=x[i];
		}
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(b));
	}
}
