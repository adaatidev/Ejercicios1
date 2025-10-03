package unit01part01;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		//Set the variables.
		int nota1;
		int nota2;
		double notaFinal;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
			//Write down the question.
			System.out.print("Ingrese su primera nota: ");
		
			//The scanner reads the user's answer.
			nota1 = reader.nextInt();
		
			//Write down the question.
			System.out.print("Ingrese su segunda nota: ");
		
			//The scanner reads the user's answer.
			nota2 = reader.nextInt();
		
			//Calculate the variable (the answer).
			notaFinal = (nota1 + nota2) / 2.0;
			
			//Show the answer.
			System.out.print("Nota media: " + notaFinal);
			
			//Turn off/Close the scanner.
			reader.close();
		
	}

}