package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

	String name;
	String url;
	List<MenuComponent> menuComponents = new ArrayList<>();

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}
	
	public MenuComponent add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException("Feature not implemented at this level");
	}

	public MenuComponent remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException("Feature not implemented at this level");
	}
	
	String print(MenuComponent menuComponent) {
		
		StringBuilder builder = new StringBuilder(menuComponent.getName());
		builder.append(":").append(menuComponent.getUrl()).append('\n');
		
		return builder.toString();
	}
	
	public abstract String toString();

	
	
}
