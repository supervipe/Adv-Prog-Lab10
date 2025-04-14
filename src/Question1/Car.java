package Question1;

public class Car extends Vehicle implements Insurance {

	private int numberOfDoors;
	private String insuranceProvider;
	
	public Car(String make, String model, int year, double price, int numberOfDoors, String insuranceProvider) {
		super(make, model, year, price);
		this.numberOfDoors = numberOfDoors;
		this.insuranceProvider = insuranceProvider;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setInsuranceProvider(String provider) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getInsuranceProvider() {
		// TODO Auto-generated method stub
		return this.insuranceProvider;
	}

	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		return getPrice() + (getPrice() * 0.05);
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Insurance provider=" + getInsuranceProvider() + ", number of doors=" + numberOfDoors +
				", premium price=" + calculatePremium() + "]");
	}
}
