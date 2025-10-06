package english01part02;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		//Set up the variable for the age.
		int age;
		
		//Set up the variable for the year.
		int year;

		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
		//Display the question.
		System.out.print("How old are you?: ");
		
		//The scanner reads the answer.
		age = reader.nextInt();
		
		//Calculate the variable.
		year = 2025 - age;
		
		//Show the answer.
		System.out.print("You were born in " + year);
		
		//Close the scanner.
		reader.close();
		
	}

}