package composite;

import java.util.Iterator;

public class Menu extends MenuComponent {

	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}

	@Override
	public MenuComponent add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
		return menuComponent;
	}

	@Override
	public MenuComponent remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
		return menuComponent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append(print(this));

		// Feature of this pattern. We know about out children => recursively navigation
		// throught our toStrig method
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			menuComponent.url = this.url.concat(menuComponent.url);
			builder.append(menuComponent.toString());
		}

		return builder.toString();
	}

}
