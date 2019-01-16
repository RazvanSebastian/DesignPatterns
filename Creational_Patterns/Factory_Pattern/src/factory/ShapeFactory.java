package factory;

import factory.shape.Circle;
import factory.shape.Rectangle;
import factory.shape.Shape;
import factory.shape.Square;
import factory.shape.Type;

public class ShapeFactory {

	public Shape getShape(Type type) {
		switch (type) {
		case SQUARE:
			return new Square();
		case RECTANGLE:
			return new Rectangle();
		case CIRCLE:
			return new Circle();
		default:
			return null;
		}
	}

}
