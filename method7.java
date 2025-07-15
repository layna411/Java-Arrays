import java.util.Scanner;
class  method7
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a:");
		int a=sc.nextInt();
		System.out.print("Enter b:");
		int b=sc.nextInt();
		System.out.print("Enter c:");
		int c=sc.nextInt();
		int ans=largeofthree(a,b,c);
		System.out.print("result :"+ans);
	}
	public static int largeofthree(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			return a;
		}
		else if (b>a && b>c)
		{
			return b;
		}
		else
			return c;
	}
}
