import java.util.*;
class HarshadNumberSum 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int N = sc.nextInt();
		int M = sc.nextInt();
		int res = harshadSum(N,M);
		System.out.println(res);
		
	}
	public static int digitSum(int num)
	{
		int temp = num;
		int sum = 0;
		while (num>0)
		{
			sum+=num%10;
			num/=10;
		}
		num = temp;
		return sum;
	}
	public static boolean isHarshadNumber(int num)
	{
		int digitsum == digitSum(num);s
		 return (num%digitsum==0);	
	}
	public static int harshadSum(int N,int M)
	{
		int sum = 0;
		for(int i=N;i<=M;i++){
		if (isHarshadNumber(i))
		   sum+=i;
		}
		return sum;
	}
}
