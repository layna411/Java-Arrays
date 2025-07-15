import java.util.*;
class a2 
{
	public static void main(String[] args) 
	{
		int[]a={2,8,2,1,8,4,3};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int [] res=removeDub(a);
		System.out.println(Arrays.toString(res));
	}
	public static int[] removeDub(int[]a)
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
