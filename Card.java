class Card
{
	String Card_holder_name;
	int limit;
	static String bank="SBI";

	public Card(String chn,int lim)
	{
		Card_holder_name=chn;
		limit=lim;
	}
	public void detailofcard()
	{
		System.out.println("card holder name:"+Card_holder_name);
		System.out.println("card limit:"+limit);
		System.out.println("Bank:"+bank);
		System.out.println(".........................................");
	}
}
