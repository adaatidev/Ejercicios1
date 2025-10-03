package unit01part02;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		//Set the variable.
		double number;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
			//Write down the question.
			System.out.print("Ingrese un número decimal: ");
			
			//The scanner reads the user's answer.
			number = reader.nextDouble();
		
			//Calculate the variable.
			number = (int)(number + 0.5);
			
			//Show the answer.
			System.out.println("Número redondeado: " + number);
		
			//Turn off/Close the scanner.
			reader.close();
		
	}

}