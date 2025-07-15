class Engine
{
	String type,cc,power;
	Engine(){}
	Engine(String type,String cc,String power){
		this.type=type;
		this.cc=cc;
		this.power=power;
	}
	public void detailsofEngine()
	{
		System.out.println("type:"+type);
		System.out.println("cc:"+cc);
		System.out.println("power:"+power);
		System.out.println("----------------------");
	}
}
