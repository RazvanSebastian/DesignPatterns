package builder;

public class LunchOrderDemo {

	public static void main(String[] args) {
		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");
		LunchOrder lunchOrder = builder.build();

		builder.bread("No bread");
		LunchOrder lunchOrder2 = builder.build();
		
		
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder2.getBread());
		
		System.out.println();
		
		System.out.println(lunchOrder);
		System.out.println(lunchOrder2);
	}

}
