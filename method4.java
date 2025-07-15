import java.util.Scanner;
class  method4
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the second value:");
		double sec=sc.nextDouble();
		double ans=hour(sec);
		System.out.print("the value for "+sec+"second is:" +ans);
	}
	public static double hour(double A)
	{
		double res;
		res=A/3600;
		return res;
	}
}
