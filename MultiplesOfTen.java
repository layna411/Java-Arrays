import java.util.*;
class MultiplesOfTen 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int N = sc.nextInt();
		int sum = 0;
		for (int i=1;i<=N ;i++ )
		{
			sum+=i*10;
		}
		System.out.println(sum);
		
	}
}
