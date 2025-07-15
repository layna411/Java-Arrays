import java.util.Scanner;
class even 
{
	static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("starting:");
		int start=sc.nextInt();
		System.out.print("ending:");
		int end=sc.nextInt();
		evennumber(start,end);
	}
	public static void evennumber(int start, int end)
	{
		if (start<=end)
		{
			if (start%2==0)
			{
				System.out.print(start +"  ");
			}
			start++;
			evennumber(start,end);
		}
	}
}
