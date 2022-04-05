package test;

public class Employee {
	String name;
	String nameJOB;
	double sal;
	Boolean ToN;

	public Employee(String name, String nameJOB, double sal, Boolean ToN) {
		this.name = name;
		this.nameJOB = nameJOB;
		this.sal = sal;
		this.ToN = ToN;
	}

	public void println_info() {
		System.out.println(this.name + "  " + this.nameJOB + "  " + this.sal);
	}

	public void salnew() {
		if (ToN == true)
			sal *= 1.10;

	}
}