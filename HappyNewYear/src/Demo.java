
public class Demo {

	public static void main(String[] args) {
	
		Storage shop = new Storage();
		
		try {
			double ap1 = shop.averagePrice();
		} catch (EmptyContainerException e) {
		
			System.out.println(e.getMessage());
		}
		
		
		
		
		shop.add(new NutCandy("Mars", 1, 2.5), 20.0);
		shop.add(new NutCandy("Snikers", 2, 45), 50.0);
		shop.add(new Candy("CHOCOLATE", 3), 40.0);
		shop.add(new  CaramelCandy("Super", 2, Filling.SEZAM), 40.0);
		
		System.out.println("Weight = " + shop.totalWeight() );
		
		
		System.out.println("Storage = \n" + shop);
	}

}
