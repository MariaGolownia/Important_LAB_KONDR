
public class NutCandy extends Candy{
	private double percentOfNuts;

	public NutCandy(String name, int price, double percentOfNuts) {
		super(name, price);
		this.percentOfNuts = percentOfNuts;
	}

	@Override
	public String toString() {
		return "NutCandy [percentOfNuts=" + percentOfNuts + ", getName()=" + getName() + ", getPrice()=" + getPrice()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	

}
