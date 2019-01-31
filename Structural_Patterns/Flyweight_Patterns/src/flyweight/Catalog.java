package flyweight;

import java.util.HashMap;
import java.util.Map;

//Factory acts as a factory and cache for Item flyweight object
public class Catalog {

	private Map<String, Item> items = new HashMap<String, Item>();

	public Item lookup(String itemName) {
		if (!items.containsKey(itemName)) {
			items.put(itemName, new Item(itemName));
		}

		return items.get(itemName);
	}

	public int totalItemsMade() {
		return items.size();
	}

}
