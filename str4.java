import java.util.*;
class  str4
{
	public static void main(String[] args) 
	{
		String s="aba";
		solve(s);
	}
	public static void solve(String s)
	{
		char[] a=s.toCharArray();
		int[]b=new int[26];
		String res=" ";
		for (int i=0;i<a.length;i++ )
		{
			for (int j=i;j<a.length ;j++ )
			{
				for (int k=i;k<=j ;k++ )
				{
					b[a[k]-'a']++;
				}
			}
		}
		for (char i='a';i<='z' ;i++ )
		{
			if (b[i-'a']!=0)
			{
				System.out.print(i+":"+b[i-'a']+"\n");
			}
		}
	}
}
