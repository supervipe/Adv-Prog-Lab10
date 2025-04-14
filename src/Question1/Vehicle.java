package Question1;

public class Vehicle {

	private String make;
	private String model;
	private int year;
	private double price;
	
	public Vehicle(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}

	public void displayDetails() {
		System.out.println("Vehicle [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]");
	}
	
	
}
