import java.util.ArrayList;
import java.util.List;

public class Gift extends Storage {

	private String discription;
	private GiftStrategy giftStrategy;

	public Gift(String discription, GiftStrategy giftStrategy) {
		this.discription = discription;
		this.giftStrategy = giftStrategy;
	}

	public void setGiftStrategy(GiftStrategy giftStrategy) {
		this.giftStrategy = giftStrategy;
	}
	
	public Gift createGift (Storage storage, int count, int totalWeight) {
		List <Candy> listCandy = new ArrayList<>();
		int w = totalWeight/count;
		int i = 0;
		for (Candy candy: listCandy) {
			this.add(candy, w);
			++i;
		}
	}

}
