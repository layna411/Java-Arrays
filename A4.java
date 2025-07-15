import java.util.*;
class A4//addition of arrray
{
	public static void main(String[] args) 
	{
		int[]a={1,2,3,4};
		System.out.println(Arrays.toString(a));
		int res=ans(a);
		System.out.println("addition of the array is:"+res);
	}
	public static int ans(int[]x)
	{
		int sum=0;
		for (int i=0;i<x.length ;i++ )
		{
			sum+=x[i];
		}
		return sum;
	}
}
