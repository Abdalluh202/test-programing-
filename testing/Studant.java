package testing;

public class Studant {
	String Name;
	double graed;
	static int IDnamber;

	public Studant(String Name, double graed) {
		this.Name = Name;
		this.graed = graed;
		IDnamber++;

	}

	public void stuINFO() {
		System.out.println(this.Name + "  " + this.graed + "  ");
	}

	public static void IDnamber1() {
		System.out.println(Studant.IDnamber);
	}
}
