class m1 
{
	public static void main(String[] args) 
	{
		int num = 333;
		int temp = num;
		int rev = 0;
		while (num>0)
		{
			rev=(rev*10)+num%10;
			num = num/10;
		}
		System.out.println(rev);
		if (rev == temp)
		 System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
