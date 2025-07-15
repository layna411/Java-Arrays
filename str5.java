class str5 
{
	public static boolean isItLetter(char data)
	{
		return data>='A' && data<='Z' || data>'a' && data<='z';
	}
	public static void main(String[] args) 
	{
		String s="hi@how#are";
		char[]a=s.toCharArray();
		int l=0,r=a.length-1;
		while (l<r)
		{
			if (isItLetter(a[l]) && isItLetter(a[r]))
			{
				char temp=a[l];
				a[l]=a[r];
				a[r]=temp;
				l++;
				r--;
			}
			if (!isItLetter(a[l]))
			{
				l++;
			}
			if (!isItLetter(a[r]))
			{
				r--;
			}
		}
		System.out.println(s);
		System.out.println(a);
	}
}
