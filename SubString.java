import java.util.*;
class SubString 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		int count = 0;		
		for (int i=0;i<n ;i++ )
		{
			int sum = 0;
			for (int j=i;j<n ;j++ )
			{
				sum+=s.charAt(j)-'0';
				if (sum!=(j-i+1))
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
