package TESTLOE06;

public class Rectangle extends Shape {
	int length;
	int width;

	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;

	}

	public void area(int length, int width) {
		int area = 0;
		area = length * width;
		System.out.println(area);
	}

}
