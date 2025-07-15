import java.util.*;
class array3 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter the size:");
		int size=sc.nextInt();
		int []a=new int[size];
		double []b=new double[size];
		for (int i=0;i<a.length ;i++ )
		{
			System.out.print("enter the element a["+i+"]:");
			a[i]=sc.nextInt();
		}
		for (int i=b.length-1;i>=0 ;i-- )
		{
			System.out.print("enter the element b["+i+"]:");
			b[i]=sc.nextDouble();
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
