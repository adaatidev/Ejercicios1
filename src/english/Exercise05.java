package english;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {

		double weight;
		double height;
		double bmi;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter your weight: ");
		weight = reader.nextDouble();
		
		System.out.print("Enter your height: ");
		height = reader.nextDouble();
		
		bmi = weight / (height * height);
		
		System.out.print("Your BMI is: " + bmi);
		
		reader.close();
		
	}

}
