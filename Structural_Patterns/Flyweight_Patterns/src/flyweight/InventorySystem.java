package flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {

	private final Catalog catalog = new Catalog();
	private final List<Order> orders = new CopyOnWriteArrayList<Order>();

	void takeOrder(String itemName, int orderNo) {
		Item item = catalog.lookup(itemName);
		Order order = new Order(orderNo, item);
		orders.add(order);
	}

	void process() {
		for (Order order : orders) {
			order.processOrder();
			orders.remove(order);
		}
	}

	String report() {
		return "\n Total Item objects made:" + catalog.totalItemsMade();
	}

}
