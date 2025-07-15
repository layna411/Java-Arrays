import java.util.*;
class  A6//merge the two array
{	
	public static void main(String[] args) 
	{
		int[]a={4,3,5,6,8};
	    int[]b={1,6,9,8,10,7};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		int[]res=merge(a,b);
		System.out.println(Arrays.toString(res));
	}
	public static int[] merge(int[]a,int[]b)
	{
		int[]ans=new int[a.length+b.length];
		int m=0,n=0;
		for (int i=0;i<ans.length ;i++ )
		{
			if (m<a.length)
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
