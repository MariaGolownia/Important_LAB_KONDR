
public class CaramelCandy extends Candy {
	
	private Filling filling;

	public CaramelCandy(String name, int price, Filling filling) {
		super(name, price);
		this.filling = filling;
	}

	@Override
	public String toString() {
		return "CaramelCandy [filling=" + filling + ", getName()=" + getName() + ", getPrice()=" + getPrice()
				+ ", toString()=" + super.toString() + "]";
	}




	


	

}
