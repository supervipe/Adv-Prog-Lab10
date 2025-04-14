package Question1;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleManagerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Car> cars = new ArrayList<Car>();
		
		while(true) {
			System.out.println("Press 0 to stop or press 1 to insert car data");
			int stop = Integer.parseInt(input.nextLine());
			if(stop == 1) {
				System.out.println("Insert the make of the car:");
				String make = input.nextLine();
				
				System.out.println("Insert the model of the car:");
				String model = input.nextLine();
				
				System.out.println("Insert the year of the car:");
				int year = Integer.parseInt(input.nextLine());
				
				System.out.println("Insert the price of the car:");
				double price = Double.parseDouble(input.nextLine());
				
				System.out.println("Insert the number of doors of the car:");
				int numberDoors = Integer.parseInt(input.nextLine());
				
				System.out.println("Insert the insurance provider of the car:");
				String insurance = input.nextLine();
				
				Car car = new Car(make, model, year, price, numberDoors, insurance);
				car.displayDetails();
				cars.add(car);
			} else if(stop == 0) {
				break;
			}
		}
	}

}
