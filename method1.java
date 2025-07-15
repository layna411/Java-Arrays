import java.util.Scanner;
class  method1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter radius of a circle:");
		double r=sc.nextDouble();
		double res=radius(r);
		System.out.print("radius of a circle is:" +res);
	}
	public static double radius(double x)
	{
		double A;
	    A=((3.14)*(x*x));
		return A;
	}
}
