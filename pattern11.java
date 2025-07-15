import java.util.Scanner;
class pattern11
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.print("enter the n value:");
		int n=sc.nextInt();
		for (int i=0;i<n ;i++ )
		{
			char ch='A';
			int k=1;
			for (int j=0;j<n ;j++ )
			{
				if ( i+j>=n-1 && i%2==0)
				{
					System.out.print(ch++ +" ");
				}
				else if (i+j>=n-1 && i%2==1)
				{
					System.out.print(k++ +" ");
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
