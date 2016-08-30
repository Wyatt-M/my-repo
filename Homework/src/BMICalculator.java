import java.util.Scanner;

public class BMICalculator {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Enter height in meters: ");
		double height = Double.parseDouble(scanner.nextLine());
		
		System.out.print("Enter weight in kilograms: ");
		double weight = Double.parseDouble(scanner.nextLine());
		
		double bmi = weight / (height * height);
		
		if (bmi < 18.5) {
			System.out.println("You are under weight.");
			System.out.println(bmi);
		}
		else if (bmi > 18.5 && bmi < 24.9) {
			System.out.println("You are normal.");
			System.out.println(bmi);
		}
		else if (bmi > 25.0 && bmi < 29.9) {
			System.out.println("You are overweight");
			System.out.println(bmi);
		}
		else {
			System.out.println("You are obese.");
			System.out.println(bmi);
		}

	}

}
