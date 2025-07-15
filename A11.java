import java.util.*;
class A11 //remove dublicates
{
	public static void main(String[] args) 
	{
		int[]a={1,2,2,3,4,5,6,6,7};
		System.out.println(Arrays.toString(a));
		int[]res=dup(a);
		System.out.println(Arrays.toString(res));
	}
	public static int[] dup(int[]a)
	{
		Arrays.sort(a);
		int[]b=new int[a.length];
		int m=0;
		for (int i=0;i<a.length-1 ;i++ )
		{
			if (a[i]!=a[i+1])
			{
				b[m++]=a[i];
			}
		}
		b[m++]=a[a.length-1];
		int[]res=new int[m];
		for (int i=0;i<res.length ;i++ )
		{
			res[i]=b[i];
		}
		return res;
	}
	
}
