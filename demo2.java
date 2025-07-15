import java.util.Scanner;
class  demo2
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int count=1;
		System.out.print("enter the n value:");
		int n=sc.nextInt();
		int even=0;
		while (count<=n)
		{
			
	   if(count%2==0)
		   
	   {
				
		System.out.println("even number is"+count);

	   }
		
		count++;
	   
		}
		 
		
	}
}
