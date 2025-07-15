class ShowRoom 
{
	String name,branch;
	Car[]cars;
	ShowRoom(String name,String branch,Car[]cars){
		this.name=name;
		this.branch=branch;
		this.cars=cars;
	}
	public void displayallCars(){
		for (int i=0;i<cars.length ;i++ )
		{
			cars[i].detailsofCar();
			cars[i].e.detailsofEngine();
		}
	}
}
