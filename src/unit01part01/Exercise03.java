package unit01part01;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Set the variables.
		int currentYear;
		int birthYear;
		int age;
	
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
			//Write down the question.
			System.out.print("¿En qué año está?: ");
			
			//The scanner reads the user's answer.
			currentYear = reader.nextInt();
			
			//Write down the other question.
			System.out.print("¿En qué año nació?: ");
			
			//The scanner reads the user's answer.
			birthYear = reader.nextInt();
			
			//Calculate the variable (the answer).
			age = currentYear - birthYear;
			
			//Show the answer.
			System.out.print("Edad: " + age);
			
			//Turn off/Close the scanner.
			reader.close();
			
	}

}