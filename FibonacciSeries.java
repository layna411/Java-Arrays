class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int n=10;
		int first=1,second=2;
		
		//System.out.print("Fibonacci Series"+first+" "+second);
		int sum =first+second;
		for (int i=2;i<n ;i++ )
		{
			int next = (first*second)*2;
			sum+=next;
			first = second;
			second = next;
		}
		System.out.println("Total Branches after stage"+n+":"+sum);
		
	}
}
