//create an array of user wish size and insert the elements  in array acc to user....
//......................................................................................
import java.util.*;
class pro1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t Enter the size:");
		int size=sc.nextInt();
		int[]a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter the element:");
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
	}
}
