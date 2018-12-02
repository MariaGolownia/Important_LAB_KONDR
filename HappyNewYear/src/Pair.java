
public class Pair {
	
	private Candy candy;
	private double weight; 
	

	public Pair(Candy candy, double weight) {
		super();
		this.candy = candy;
		this.weight = weight;
	}


	public Candy getCandy() {
		return candy;
	}


	public void setCandy(Candy candy) {
		this.candy = candy;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Pair [candy=" + candy + ", weight=" + weight + "]";
	}
	
	

}
