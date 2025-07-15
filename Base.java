class Base 
{
	public static void main(String[] args) 
	{
		Car car1=new Car("tata","white",1200000,new Engine("diesel","200cc","123hp"));
		Car car2=new Car("bmw","black",1500000,new Engine("diesel","250cc","503hp"));
		Car car3=new Car("varna","green",520000,new Engine("diesel","300cc","623hp"));
		Car[]cars={car1,car2,car3};
		ShowRoom showroom=new ShowRoom("layna carzz","Ranipet",cars);
		showroom.displayallCars();
	}
}
