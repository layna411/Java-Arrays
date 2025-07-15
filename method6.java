import java.util.Scanner;
class  method6
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number:");
		long num=sc.nextLong();
		double res=cube(num);
		System.out.print("cube of the "+num+" is :" +res);
	}
	public static double cube(double a)
	{
		double A;
		A=a*a*a;
		return A;
	}
}
