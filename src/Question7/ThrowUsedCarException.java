package Question7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowUsedCarException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsedCar[] cars = new UsedCar[7];
		Scanner input = new Scanner(System.in);
		for( int i = 0; i < cars.length; i++) {
			System.out.println("Inser the data of " + (i + 1) + " used car");
			String VIN,make,model;
			int year;
			double milleage,price;
			try {
				System.out.println("Insert the VIN of the car:");
				VIN = input.nextLine();
				System.out.println("Insert the make of the car:");
				make = input.nextLine();
				System.out.println("Insert the model of the car:");
				model = input.nextLine();
				
				System.out.println("Insert the year of the car:");
				year = Integer.parseInt(input.nextLine());
				
				System.out.println("Insert the milleage of the car:");
				milleage = Double.parseDouble(input.nextLine());
				System.out.println("Insert the price of the car:");
				price = Double.parseDouble(input.nextLine());
				
				UsedCar car = new UsedCar(VIN, make, model, year, milleage, price);
				cars[i] = car;
			} catch(InputMismatchException e) {
				cars[i] = null;
				System.out.println(e.getMessage());
			} catch (UsedCarException e) {
				cars[i] = null;
				System.out.println(e.getMessage());
			}
		}
		
		for(int i = 0; i < cars.length; i++) {
			if(cars[i] != null) {
				System.out.println(cars[i]);
			}
		}
	}

}
