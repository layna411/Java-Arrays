class Car 
{
	String name,colour;
	double price;
	Engine e;
	Car(){}
	Car(String name,String colour,double price,Engine e){
		this.name=name;
		this.colour=colour;
		this.price=price;
		this.e=e;
	}
	public void detailsofCar(){
		System.out.println("name:"+name);
		System.out.println("colour:"+colour);
		System.out.println("price:"+price);
	}
}
