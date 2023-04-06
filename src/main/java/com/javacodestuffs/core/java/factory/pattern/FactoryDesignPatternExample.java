package com.javacodestuffs.core.java.factory.pattern;

// Define an interface to create objects
interface Shape {
	void draw();
}

// Create concrete classes implement the Shape interface
class Circle implements Shape {
	public void draw() {
		System.out.println("Circle::draw() method is called.");
	}
}

class Rectangle implements Shape {
	public void draw() {
		System.out.println("Rectangle::draw() method is called.");
	}
}

class Triangle implements Shape {
	public void draw() {
		System.out.println("Triangle::draw() method is called.");
	}
}

class Parallelogram implements Shape {
	public void draw() {
		System.out.println("Parallelogram::draw() method is called.");
	}
}

class Square implements Shape {
	public void draw() {
		System.out.println("Square::draw() method is called.");
	}
}

// Create a factory to generate objects of concrete classes based on requirement
class ShapeFactory {
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
			return new Triangle();
		}

		else if (shapeType.equalsIgnoreCase("PARRALLELOGRAM")) {
			return new Parallelogram();
		}
		return null;
	}
}

public class FactoryDesignPatternExample {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape parallelogram = shapeFactory.getShape("PARRALLELOGRAM");
		parallelogram.draw();

		Shape triangle = shapeFactory.getShape("TRIANGLE");
		triangle.draw();

		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();

		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();

		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();

	}
}
