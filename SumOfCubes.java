import java.util.*;
class SumOfCubes 
{
	static Scanner sc  = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int N =sc.nextInt();
		int M = sc.nextInt();
		int sum=0;
		for (int i=N;i<=M ;i++ )
		{
	       sum+=(i*i*i);
		}
		System.out.println("Sum of cubes from "+N+" to "+M+" are "+sum);
	}
}
