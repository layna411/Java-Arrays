class str2
{
	public static void solve(String str)
	{
		char[]a =str.toCharArray();
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]==' ')
			{
				continue;
			}
			
			int count=1;
			for (int j=i+1;j<a.length ;j++ )
			{
				if (a[i]==a[j])
				{
					count++;
					a[j]=' ';
				}
			}
			System.out.println(a[i]+":"+count);
		}
	}
		
	public static void main(String[] args) 
	{
		String s="hello";
		System.out.println("Given:"+s);
		solve(s);
	}
}
