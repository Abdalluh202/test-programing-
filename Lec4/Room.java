package Lec4;

public class Room {

	int Number;
	String MODELROOM;
	private String Name;
	private double price;

	public Room(String MODELROOM, int Number) {
		this.Number = Number;
		this.MODELROOM = MODELROOM;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void info(String name, double price) {
		this.Name = name;
		this.price = price;
	}

}
