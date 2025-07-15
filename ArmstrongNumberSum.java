import java.util.*;
class ArmstrongNumberSum 
{
	static Scanner sc  = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int N =sc.nextInt();
		int M = sc.nextInt();
	    int res = armstrongSum(N,M);
		System.out.println("Sum of armstrongNumber from "+N+" to "+M+" are "+res);
	}
	public static boolean isArmstrongNumber(int num)
	{
		 int count = 0;
		 int temp = num;
	     while (num>0)
	     {
			 num/=10;
			 count++;
	     }
		 num = temp;
		 int sum=0,ans=1;
		 for (int i=num;i>0 ;i/=10 )
		 {
			 ans =1;
			 int x = i%10;
			 int n = count;
			 for (int j=1;j<=n ;j++ )
			 {
				 ans*=x;
			 }
			 sum+=ans;
		 }
		 if (sum==num)
		  return true;
		 
		return false;
	}
	public static int armstrongSum(int N,int M)
	{ 
		int sum = 0;
		for (int i=N;i<=M ;i++ )
		if (isArmstrongNumber(i))
		{
		    sum+=i;
		}
		return sum;
	}
}
