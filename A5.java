import java.util.*;
class A5//reverse of arrray
{
	public static void main(String[] args) 
	{
		int[]a={1,2,3,4};
		System.out.println(Arrays.toString(a));
		ans(a);
	}
	public static void ans(int[]a)
	{
		int l=0,r=a.length-1;
		while (l<r)
		{
			int temp=a[l];
			a[l]=a[r];
			a[r]=temp;
			l++;
			r--;
		}
		System.out.println(Arrays.toString(a));
	}
}
