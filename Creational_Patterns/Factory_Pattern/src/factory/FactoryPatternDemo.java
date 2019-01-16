package factory;

import factory.shape.Shape;
import factory.shape.Type;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape circle = factory.getShape(Type.CIRCLE);
		Shape square = factory.getShape(Type.SQUARE);
		Shape rectangle = factory.getShape(Type.RECTANGLE);

		circle.draw();
		square.draw();
		rectangle.draw();
	}

}
