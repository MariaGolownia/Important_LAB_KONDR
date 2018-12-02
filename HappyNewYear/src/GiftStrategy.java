import java.util.ArrayList;
import java.util.List;

public interface GiftStrategy {
	
	List <Candy> getListCandy (Storage storage) throws EmptyContainerException;

}



class HighGiftStrategy implements GiftStrategy{
	@Override
	public List<Candy> getListCandy(Storage storage) throws EmptyContainerException {
	
			double ap = storage.averagePrice();
			List <Candy> listCandy = new ArrayList<>();
			
			for(Pair pair : storage.getStorage()) {
				if(pair.getCandy().getPrice()> ap) {
					listCandy.add(pair.getCandy());
				}
			}
		return listCandy;
	}
	
};


class LowGiftStrategy implements GiftStrategy{
	@Override
	public List<Candy> getListCandy(Storage storage) throws EmptyContainerException {
	
			double ap = storage.averagePrice();
			List <Candy> listCandy = new ArrayList<>();
			
			for(Pair pair : storage.getStorage()) {
				if(pair.getCandy().getPrice() < ap) {
					listCandy.add(pair.getCandy());
				}
			}
		return listCandy;
	}
	
};