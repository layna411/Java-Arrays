class pattern4
{
	public static void main(String[] args) throws Exception
	{
		int n=21;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if ( i==0 || i==n-1 )
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
