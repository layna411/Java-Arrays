class str1
{
	public static int solve(String str)
	{
		char[]a =str.toCharArray();
		int sum=0;
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]>='0' && a[i]<='9')
			{
				sum=sum+(a[i]-48);
			}
		}
			return sum;
	}
	public static void main(String[] args) 
	{
		String s="sy23e5d";
		System.out.println("Given:"+s);
		System.out.println("Result:"+solve(s));
	}
}
