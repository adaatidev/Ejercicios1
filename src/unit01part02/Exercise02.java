package unit01part02;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		//Set the variables.
		int number;
		int suma;
		
		//Set up the scanner.
		Scanner reader = new Scanner(System.in);
		
		//Ask the question.
		System.out.println("Ingrese un número: ");
		number = reader.nextInt();
		
		suma = number % 7 == 0 ? 0 : 7 - number % 7;
		
		System.out.println("Número a sumar para que sea múltiplo de 7: " + suma);
		
		reader.close();
		
	}

}
