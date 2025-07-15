import java.util.*;
class a1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[] a={8,2,-9,4,31,5,7};
		System.out.print("enter the n value:");
		int n = sc.nextInt();
		System.out.println(Arrays.toString(a));
		int res=largestArray(n,a);
		System.out.println("reslut:"+res);
	}
	public static int largestArray(int n,int[] a)
	{
		int max= Integer.MIN_VALUE;
		for(int k=1;k<=n ;k++ )
		{
			max= Integer.MIN_VALUE;
			for(int i=0;i<a.length ;i++ )
			{
				if(a[i]>max)
				{
					max=a[i];
				}
			}
			for (int i=0;i<a.length ;i++ )
			{
				if (a[i]==max)
				{
					a[i]= Integer.MIN_VALUE;
				}
			}
		}
		return max;
	}
}