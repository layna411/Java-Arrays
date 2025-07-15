import java.util.*;
class A10   //single digit is -1 and first and last digit will be added
{
	public static void main(String[] args) 
	{
		int[]a={121,23,4,2,76};
		System.out.println(Arrays.toString(a));
		slove(a);
		System.out.println(Arrays.toString(a));
	}
	public static int add(int num)
	{
		if (num>=0 && num<=9)
		{
			return -1;
		}
		int last=num%10;
		while (num>9)
		{
			num/=10;
		}
		return(num+last);
	}
	public static void slove(int[]a)
	{
		for (int i=0;i<a.length ;i++ )
		{
			a[i]=add(a[i]);
		}
	}
}
