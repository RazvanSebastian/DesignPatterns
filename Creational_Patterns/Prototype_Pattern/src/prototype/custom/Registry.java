package prototype.custom;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<String, Item> items = new HashMap<>();

	public Registry() {
		loadItems();
	}

	public Item createItem(String type) {
		Item item = null;

		try {
			item = (Item) items.get(type).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return item;
	}

	private void loadItems() {
		Author author = new Author();

		Movie movie = new Movie();
		movie.setTitle("Basic movie");
		movie.setPrice(19.9);
		movie.setRuntime("2 hours");
		movie.setAuthor(author);
		items.put("Movie", movie);

		Book book = new Book();
		book.setTitle("Basic book");
		book.setPrice(10.19);
		book.setNumberOfPages(230);
		items.put("Book", book);

	}
}
