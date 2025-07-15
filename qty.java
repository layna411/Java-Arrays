class qty 
{
	public static void main(String[] args) 
	{
		double wallet=5000;
		int price=1000;
		int qty=3;
		System.out.println("total amount:"+wallet);
		price=price*qty;
		System.out.println("price of single pair shoe:"+price);
		System.out.println("no of shoes will be purchase:"+qty);
	    System.out.println("total bill:"+price);
		wallet=wallet-price;
		System.out.println("bal amount:"+wallet);
	}
}
