package flyweight;

public class Order {

	private final int orderNo;
	private final Item item;

	public Order(int orderNo, Item item) {
		super();
		this.orderNo = orderNo;
		this.item = item;
	}

	public void processOrder() {
		System.out.println("Ordering " + item + " with order number " + orderNo);
	}

}
