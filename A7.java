import java.util.*;
class  A7//zigzag and merge the two array
{	
	public static void main(String[] args) 
	{
		int[]a={4,3,5,6,8};
	    int[]b={1,6,9,8,10};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		int[]res=zigzag(a,b);
		System.out.println(Arrays.toString(res));
	}
	public static int[] zigzag(int[]a,int[]b)
	{
		int[]ans=new int[a.length+b.length];
		int m=0,n=0;
		for (int i=0;i<ans.length ;i++ )
		{
			if (i%2==0)
			{
				ans[i]=a[m++];
			}
			else if (n<b.length)
			{
				ans[i]=b[n++];
			}
		}
		return ans;
	}
}
