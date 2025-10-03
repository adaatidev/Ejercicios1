package unit01part01;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		//Set the variable.
		int number;
		
			//Set up the scanner for reading the user's keyboard.
			Scanner reader = new Scanner(System.in);
		
			//Write down the question.
			System.out.print("Ingrese un número: ");
			
			//The scanner starts reading the user's answer.
			number = reader.nextInt();
			
			//Shows the answer.
			System.out.println("Número ingresado: " + number);
			
			//Turn off/Close the scanner.
			reader.close();
		
	}

}