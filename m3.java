class m3 
{
	public static void main(String[] args) 
	{
		int num=371;
		int count = 0;
		int temp = num;
		while (num>0)
		{
			num=num/10;
			count++;
		}
		num = temp;
		int sum = 0,ans = 1;
		for (int i=num;i>0 ;i/=10 )
		{
			int x = i%10;
			ans = 1;
			int n = count;
			for (int j=1;j<=n ;j++ )
			{
				ans*=x;
			}
			sum+=ans;
		}
		 
			 if (sum == num)
			 System.out.println("Armstrong"+sum);
		 else 
			 System.out.println("Not An Armstong");
			 
		
		
	}
}
