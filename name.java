import java.util.Scanner;
class name
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.print("enter the n value:");
		int n=sc.nextInt();
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if ( j==0 || i==n-1)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}//1box L
				System.out.print(" ");
				
			for (int j=0;j<n ;j++ )
			{
				if (j==0 || i==0 || j==n-1 || i==n/2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}	// box 2 A
			      System.out.print(" ");
		   
			for (int j=0;j<n ;j++ )
			{
				if ( j==n-1 || i==n/2 || i==n-1 || j==0 && i<n/2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}	//box 3 Y
			      System.out.print(" ");
			for (int j=0;j<n ;j++ )
			{
				if (j==0 || j==n-1 || i==j)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}	// box4 N
			      System.out.print(" ");
		   for (int j=0;j<n ;j++ )
			{
				if (j==0 || i==0 || j==n-1 || i==n/2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}	// box5 A
			      System.out.print(" ");
				Thread.sleep(10);
			
			System.out.println();
			
		}
		
	}
}