package Devices;

public class Mobile extends PortableDevice {
	int number_of_sims;

	public Mobile(String manufacture, double secreen_size, String hasCharger, int number_of_sims) {
		super(manufacture, secreen_size, hasCharger);
		this.number_of_sims = number_of_sims;
	}

	@Override
	public void Print_info() {
		super.Print_info();
		System.out.println("number_of_sims: " + number_of_sims);
	}
}
