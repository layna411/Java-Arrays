import java.util.Scanner;
class armstrong

{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter the n value:");
		int number=sc.nextInt();
		int count=0;
		int temp=number;
		while (number>0)
		{
			number/=10;
			count++;
		}
		number=temp;
		int sum=0;
		int ans=1;
		for (int i=number ; i>0 ; i/=10 )
		{
			int x=i%10;
			ans=1;
			int n= count;
			for (int k=1;k<=n ;k++ )
			{
				ans*=x;
			}
			sum+=ans;
		}
		if (sum==number)
		{
			System.out.println("it is armstrong");
		}
		else 
			System.out.println("it is not a armstrong");
		
	}
}
