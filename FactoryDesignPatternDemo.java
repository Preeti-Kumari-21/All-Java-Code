package DesignPattern;

public class FactoryDesignPatternDemo {

	public static void main(String[] args) {
		
		ShapeFactory shapeType = new ShapeFactory();
		
		Shape shape1 = shapeType.getShape("CIRCLE");
		shape1.draw();
		Shape shape2 = shapeType.getShape("RECTANGLE");
		shape2.draw();
		Shape shape3 = shapeType.getShape("SQUARE");
		shape3.draw();

	}

}
