package flyweight;

public class FlyweightDemo {

	public static void main(String[] args) {
		InventorySystem inventorySystem = new InventorySystem();
		
		inventorySystem.takeOrder("Samsung TV", 361);
		inventorySystem.takeOrder("Based Headphones", 200);
		inventorySystem.takeOrder("Roomba", 355);
		inventorySystem.takeOrder("Samsunt TV", 500);
		inventorySystem.takeOrder("Based Headphones", 201);
		inventorySystem.takeOrder("Samsunt TV", 505);
		inventorySystem.takeOrder("Based Headphones", 212);
		inventorySystem.takeOrder("Roomba", 213);
		
		inventorySystem.process();
		
		System.out.println(inventorySystem.report());
	}

}
