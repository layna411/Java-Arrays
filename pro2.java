//print arra from right to lift
//..............................
import java.util.*;
class  pro2
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the size:");
		int size=sc.nextInt();
		int[]a=new int[size];
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print("Enter the element:");
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
	}
}
