import java.util.*;
class A8 //plindrome if not a plindrome print -1
{
	public static int isplindrome(int num) 
	{
		int temp=num, rev=0;
		while (num>0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		if (temp==rev)
		{
			return -1;
		}
		return rev;
	}
    public static void slove(int []a)
	{
		for (int i=0;i<a.length ;i++ )
		{
			a[i]=isplindrome(a[i]);
		}
	}
	public static void main(String[]args)
	{
		int[]a={34,88,43,92,44};
		System.out.println(Arrays.toString(a));
		slove(a);
		System.out.println(Arrays.toString(a));
	}
}
