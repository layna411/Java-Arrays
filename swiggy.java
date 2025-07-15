import java.util.Scanner;
class swiggy 
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) throws Exception
		
	{
		System.out.println("\t\t\tWelcome to swiggy");
		System.out.println("\t\t\t------------------------");
		System.out.println("Select the hotel");
		System.out.println("1.buhari\n2.a2b\n3.s.s.hydrebed\n4.amma hotel");//hotel names
		int hotel_input=sc.nextInt();
		switch (hotel_input)
		{
		case 1:{//buhari hotel.............
			System.out.println("welcome to buhariii");
		    System.out.println("select your food");
			System.out.println("------------------");
			System.out.println("1.mutton biriyani\n2.chicken biriyani\n3.prawn biriyani");//menuuuuuu
			int food_selected=sc.nextInt();
			switch (food_selected)
			{
			case 1:{
				System.out.println("your oder is mutton biriyani");
			    double price=350;
			    System.out.println("enter the qty:");
				int qty=sc.nextInt();
				double bill=price*qty;
				System.out.println("total bill:"+bill);
				System.out.println("order confirmation");
				System.out.println("1.yes\n2.no");
				int order=sc.nextInt();
				//
				switch (order)
				{
				case 1:{
					System.out.println("select the payment mode");
					System.out.println("1.gpay\n2.phonepay")
					int mode=sc.nextInt();
					switch (mode)
					{
					case 1:{
						System.out.println("enter the bill amount:"+bill);
						
						
						break;}
					case 2:{break;
					
					}
					break;}
				case 2:{break;
				
				}
			
			case 2:{
					break;}
			case 3:{
					break;}
			
			}
			
			break;}//buhari
	    case 2:{
			break;}//a2b
	    case 3:{
			break;}//s.s
	    case 4:{
			break;}//amma hotel
		
		
		}
	}
}
