package unit01part02;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		//Set the variables.
		int num1;
		int num2;
		int mult;
		
		//Set up the scanner.
		Scanner reader = new Scanner(System.in);
		
		//Ask the questions.
		System.out.println("Ingrese un primer número: ");
		num1 = reader.nextInt();
		
		System.out.println("Ingrese un segundo número: ");
		num2 = reader.nextInt();
		
		//Set the 
		mult = num1 % num2 == 0 ? 0 : num2 - num1 % num2;
		
		//
		System.out.println("Número a sumar para que sea múltiplo: " + mult);
		
		reader.close();
		
	}

}
