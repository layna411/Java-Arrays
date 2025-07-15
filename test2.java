import java.util.*;
class Test2 
{
	public static void main(String[] args) 
	{
	   String problem="the cost of 1 pen i 10 rs and cost of 10 pen 100";
	   int res=slove(problem);
	   System.out.println("the sum of the num is:"+res);
	}
	public static int slove(String a){
		int sum=0;
		//sint val=Integer.parse(a);
		
	  for (int i=0;i<a.length() ;i++ )
	  {
		  char ch=a.charAt(i);
		  
		  if (ch>='0' && ch<='9')
		  {
			  
			  sum+=ch;
		  }
		  
	  }
	  return sum;		
	}
}
