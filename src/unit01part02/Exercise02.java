package unit01part02;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		//Set the variables.
		int number;
		int suma;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
			//Write down the question.
			System.out.println("Ingrese un número: ");
			
			//The scanner reads the user's answer.
			number = reader.nextInt();
		
			//Calculate the variable.
			suma = number % 7 == 0 ? 0 : 7 - number % 7;
			
			//Show the answer.
			System.out.println("Número a sumar para que sea múltiplo de 7: " + suma);
		
			//Turn off/Close the scanner.
			reader.close();
		
	}

}
