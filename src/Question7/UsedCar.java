package Question7;

public class UsedCar {

	private String VIN;
	private String make;
	private String model;
	private int year;
	private double milleage;
	private double price;
	
	public UsedCar(String vIN, String make, String model, int year, double milleage, double price) throws UsedCarException {
		super();
		this.VIN = vIN;
		this.make = make;
		this.model = model;
		this.year = year;
		this.milleage = milleage;
		this.price = price;
		
		if(VIN.length() != 4 || (!model.equals("Ford") && !model.equals("Honda") && !model.equals("Toyota") 
				&& !model.equals("Chrysler") && !model.equals("Chrysler")) || (year < 1997 && year > 2024) || milleage < 0 ||
				price < 0) {
			throw new UsedCarException(VIN);
		}
	}

	@Override
	public String toString() {
		return "UsedCar [VIN=" + VIN + ", make=" + make + ", model=" + model + ", year=" + year + ", milleage="
				+ milleage + ", price=" + price + "]";
	}
	
	
	
}
