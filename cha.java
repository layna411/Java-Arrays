class cha 
{
	public static void main(String[] args) 
	{
		int a[]={131,11,48};
		int digits[]=new int[10];
		int count=0;
		for (int i=0;i<a.length ;i++ )
		{
			int num=a[i];
			while (num>0)
			{
				digits[count]=num%10;
				count++;
				num=num/10;
			}
		}
		for (int i=0;i<count-1 ;i++ )
		{
			for (int j=i+1;j<count ;j++ )
			{
				if (digits[i]>digits[j])
				{
					int temp=digits[i];
					digits[i]=digits[j];
					digits[j]=temp;
				}
			}
		}
		for (int i=0;i<count ;i++ )
		{
			System.out.print(digits[i] +" ");
		}
		
	}
}
