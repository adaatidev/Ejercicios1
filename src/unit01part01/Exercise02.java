package unit01part01;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		//Set the variables (NY -> Next Year).
		int age;
		int ageNY;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
			//Write down the question.
			System.out.print("Ingrese su edad actual: ");
			
			//The scanner starts reading the user's answer.
			age = reader.nextInt();
			
			//Calculate the variable (the user's answer).
			ageNY = age + 1;
			
			//Shows the answer.
			System.out.println("Su edad dentro de un año: " + ageNY);
			
			//Turn off/Close the scanner.
			reader.close();
		
	}

}