package english01part02;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		//Set the variable for pounds.
		double lb;
		
		//Set the variable for kilos.
		double kg;
		
		//Set the constant for the value.
		final double lbn = 2.2;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
		//PROMPT for value in pounds.
		System.out.print("Enter pounds: ");
		
		//ENTER value in pounds.
		lb = reader.nextDouble();
		
		//SET value to old value.
		kg = lb / lbn;
		
		//DISPLAY value in kilos.
		System.out.print("Lb to kg: " + kg);
		
		//END.
		reader.close();
		
	}

}
