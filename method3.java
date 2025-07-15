import java.util.Scanner;
class  method3
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the value of meter:");
		double m=sc.nextDouble();
		double kilo=kilometer(m);
		System.out.print("kilometer of "+m+" is:"+kilo);
	}
	public static double kilometer(double A)
	{
		double res;
		res=A/1000;
		return res;
	}
}