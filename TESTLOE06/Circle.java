package TESTLOE06;

public class Circle extends Shape {
	double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;

	}

	public void area(double radius) {
		double area = 0;
		area = radius * 3.14;
		System.out.println(area);
	}

}
