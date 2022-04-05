package Devices;

public class Tablet extends PortableDevice {
	boolean hsa_sim;

	public Tablet(String manufacture, double secreen_size, String hasCharger, boolean hsa_sim) {
		super(manufacture, secreen_size, hasCharger);
		this.hsa_sim = hsa_sim;
	}

	@Override
	public void Print_info() {
		super.Print_info();
		System.out.println("hsa_sim: " + hsa_sim);
	}
}
