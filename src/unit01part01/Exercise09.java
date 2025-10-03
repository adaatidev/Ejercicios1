package unit01part01;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		
		//Set the variables.
		int age;
		boolean mayor;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
			//Write down the question.
			System.out.print("Ingrese su edad:");
			
			//The scanner reads the user's answer.
			age = reader.nextInt();
		
			//Calculate the boolean (answer).
			mayor = (age >= 18);
		
			//Show the answer.
			System.out.print("Mayor de edad: " + mayor);
			
			//Turn off/Close the scanner.
			reader.close();
			
	}

}