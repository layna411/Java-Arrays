class HarshadNumber 
{
	public static void main(String[] args) 
	{
		int sum =0;
		int n = 121;
		int temp = n;
		while (n>0)
		{
			sum+=n%10;
			n/=10;
		}
		n = temp;
		if (n%sum==0)
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
		
	}
}
