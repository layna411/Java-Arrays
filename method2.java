import java.util.Scanner;
class  method2
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the rupees:");
		long rup=sc.nextLong();
		double dol=dollar(rup);
		System.out.print("dollar of the "+rup+" is :" +dol);
	}
	public static double dollar(double a)
	{
		double A;
		A=a/64;
		return A;
	}
}
