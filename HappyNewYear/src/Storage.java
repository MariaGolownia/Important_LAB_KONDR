import java.util.ArrayList;
import java.util.List;

public class Storage {

	private List<Pair> storage = new ArrayList<>();

	
	public List<Pair> getStorage() {
		return storage;
	}

	public void add(Candy candy, double weight) {
		storage.add(new Pair(candy, weight));	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (Pair p : storage) {
			sb.append(p).append('\n');
		}
		return sb.toString();
	}

	public double totalWeight() {
		double sum = 0;

		for (Pair pair : storage) {
			sum += pair.getWeight();
		}
		return sum;

	}

	public double averagePrice() throws EmptyContainerException {
		if (storage.isEmpty()) {
			throw new EmptyContainerException("Error: container is empty (message from averagePrice)!");
		}
		double sum = 0;

		for (Pair pair : storage) {
			sum += pair.getCandy().getPrice();
		}
		return sum / storage.size();

	}

}
