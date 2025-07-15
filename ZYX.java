import java.util.Scanner;
class ZYX
{
	static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("start:");
		char n=sc.next().charAt(0);
		ZYX(n);
	}
	public static void ZYX(char n)
	{
		if (90<=n)
		{
			System.out.print(n+ " ");
			n++;
			ZYX(n);
			}	
		}
	}
