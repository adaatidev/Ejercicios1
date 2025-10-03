package unit01part01;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		
		//Set the variables.
		double peseta;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
			//Write down the question.
			System.out.print("Ingrese número de pesetas: ");
		
			//The scanner reads the user's answer.
			peseta = reader.nextDouble();
		
			//Show the answer.
			System.out.print("Pasado a euros: " + peseta / 166);
		
			//Turn off/Close the scanner.
			reader.close();
		
	}
}