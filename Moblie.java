class Moblie
{
    String name,branch;
	long GST_NO;
	Moblie(String name,String branch,long GST_NO){
		this.name=name;
		this.branch=branch;
		this.GST_NO=GST_NO;
	}
}
class MoblieName extends Moblie
{
	String Moblienames;
	MoblieName(String Moblienames,String name,String branch,long GST_NO){
		super(name,branch,GST_NO);
		this.Moblienames=Moblienames;
	}
	public void MoblieName(){
		System.out.println("Moblie Name"+Moblienames);
		System.out.println("Company name:"+name);
		System.out.println("Company Branch:"+branch);
		System.out.println("Company GST Number:"+GST_NO);
	}
}
class Specification extends Moblie
{
	String processer,ram,camera,battery;
	Specification(String processer,String ram,String camera,String battery){
		super(name,branch,GST_NO);
		this.processer=processer;
		this.ram=ram;
		this.camera=camera;
		this.battery=battery;
	}
	public void Specification(){
		
	}
}