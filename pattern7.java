import java.util.Scanner;
class pattern7
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
				if ( i+j>=n-1)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
				Thread.sleep(10);
			}
			System.out.println();
			
		}
		
	}
}
