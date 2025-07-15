class m2 
{
	public static void main(String[] args) 
	{
		int b = 1101;
		int x = 1;
		int sum = 0;
		while (b>0)
		{
			sum+=b%10*x;
			b=b/10;
			x*=2;
		}
		System.out.println(sum);
	}
}
