import java.util.Scanner;
class Panagram 
{
	static Scanner sc=new Scanner(System.in)
	public static void main(String[] args) {
		System.out.println("Enter a string:");
		string value=sc.nextLine();
		value=toLowercase();
		
		boolean[] alp = new boolean[26];
		for (int i=0;i<value.length() ;i++ )
		{
			char ch=value.charAt(i);
			if (ch>='a' && ch<='z')
			{
				alp[ch-'a']=true;
			}
		}
		boolean ispangram=true;
		for (boolean b:alp )
		{
			if(!b){
				ispangram=false;
				break;
			}
		}
		if(ispangram){
			System.out.println("the inp is pangram");
		}
		else
			System.out.println("the inp is not pangram");

	}
}


