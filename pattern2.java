class pattern2
{
	public static void main(String[] args) throws Exception
	{
		int n=21;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if ( j==0 || i+j==n-1 || i==0)
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
