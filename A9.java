import java.util.*;
class A9 //prime number should be added 
{
	public static boolean isprime(int num) 
	{
		if (num==0||num==1)
		{
			return false;
		}
		for (int i=2;i<num/2 ;i++ )
		{
			if (num%i==0)
			{
				return false;
			}
		}
		return true;
	}
		public static int slove(int[]a)
		{
			int sum=0;
			for (int i=0;i<a.length ;i++ )
			{
				if (isprime(a[i]))
				{
					sum+=a[i];
				}
			}
			return sum;
		}
		public static void main(String []args)
		{
			int[]a={5,2,34,3,64,5};
			System.out.println(Arrays.toString(a));
			int res=slove(a);
			System.out.println("result:"+res);
		}
		
	}
