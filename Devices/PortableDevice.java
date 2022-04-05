package Devices;

public class PortableDevice {
	String manufacture;
	double Secreen_size;
	String HasCharger;

	public PortableDevice(String manufacture, double secreen_size, String hasCharger) {
		this.manufacture = manufacture;
		Secreen_size = secreen_size;
		HasCharger = hasCharger;
	}

	public void Print_info() {
		System.out.println(manufacture + "  (" + Secreen_size + ")  " + HasCharger);
	}

}
