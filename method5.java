import java.util.Scanner;
class  method5
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the speed(kmph):");
		double speed=sc.nextDouble();
		System.out.print("the Enter distance(km):");
		double distance=sc.nextDouble();
		double ans=time(speed,distance);
		System.out.print("Time taken to travel :"+ans);
	}
	public static double time(double x,double y)
	{
		double time;
		time=y/x;
		return time;
	}
}
