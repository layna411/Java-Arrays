import java.util.Scanner;
class abc
{
	static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("start:");
		char n=sc.next().charAt(0);
		abc (n);
	}
	public static void abc(char ch)
	{
		if (ch<='z') return;
		{
			System.out.print(ch+ " ");
			 ch + 1;
			 abc(char);
			}	
			
		}
	}
