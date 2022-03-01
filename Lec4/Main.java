package Lec4;

public class Main {

	public static void main(String[] args) {
		Room R1 = new Room("L", 1);
		Room R2 = new Room("S", 2);
		R1.info("Mohammed", 200);
		R2.info("Ali", 250);
		System.out.println(R1.MODELROOM + " " + R1.Number + " " + R1.getName() + " " + R1.getPrice());
	}

}
