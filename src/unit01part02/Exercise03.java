package unit01part02;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		//Set the variables.
		int num1;
		int num2;
		int mult;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
			//Write down the question.
			System.out.println("Ingrese un primer número: ");
		
			//The scanner reads the user's answer.
			num1 = reader.nextInt();
		
			//Write down the question.
			System.out.println("Ingrese un segundo número: ");
		
			//The scanner reads the user's answer.
			num2 = reader.nextInt();
		
			//Calculate the variable.
			mult = num1 % num2 == 0 ? 0 : num2 - num1 % num2;
		
			//Show the answer.
			System.out.println("Número a sumar para que sea múltiplo: " + mult);
		
			//Turn off/Close the scanner.
			reader.close();
		
	}

}
