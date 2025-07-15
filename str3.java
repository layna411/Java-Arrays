class str3 
{
	public static void main(String[] args) 
	{
		String s="abcd";
		slove(s);
	}
	public static void slove(String s)
	{
		char[]a=s.toCharArray();
		String res=" ";
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=i;j<a.length ;j++ )
			{
				res+=a[j];
				System.out.print(res+" ");
			}
			res=" ";
			System.out.println();
		}
	}
}
