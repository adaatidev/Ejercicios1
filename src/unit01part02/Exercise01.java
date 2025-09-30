package unit01part02;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		//Set the variable.
		double number;
		int entero;
		
		//Create the scanner.
		Scanner reader = new Scanner(System.in);
		
		//Write down the question.
		System.out.print("Ingrese un número decimal: ");
		number = reader.nextDouble();
		
		entero = number + 0.5;
		
		System.out.println("Número redondeado: " + entero);
		
		//Close the scanner.
		reader.close();
		

	}

}
