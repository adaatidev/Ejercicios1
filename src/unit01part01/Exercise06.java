package unit01part01;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		//Set the variables.
		double number1;
		double number2;
		final double suma;
		final double resta;
		final double divi;
		final double mul;
		
		//Set up the scanner.
		Scanner reader = new Scanner(System.in);
			
			//Write down the question.
			System.out.print("Ingrese un primer número mayor que el segundo:");
			
			//The scanner reads the user's answer.
			number1 = reader.nextDouble();
			
			//Write down the question.
			System.out.print("Ingrese un segundo número menor que el primero:");
			
			//The scanner reads the user's answer.
			number2 = reader.nextDouble();
			
			//Calculate the variables (the answers).
			suma = number1 + number2;
			resta = number1 - number2;
			divi = number1 / number2;
			mul = number1 * number2;
			
			//Show the answers.
			System.out.println("Soluciones:");
			System.out.println("Solución suma:" + suma);
			System.out.println("Solución resta:" + resta);
			System.out.println("Solución división:" + divi);
			System.out.println("Solución multiplicación:" + mul);
			
			//Turn off/Close the scanner.
			reader.close();
			
	}

}
