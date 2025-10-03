package unit01part02;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		//Set the variables.
		int entInf;
		int entAdu;
		final double PRE_INF = 15.50;
		final double PRE_ADU = 20;
		double total;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
			//Write down the question.
			System.out.print("Ingrese número de entradas infantiles: ");
		
			//The scanner reads the user's answer.
			entInf = reader.nextInt();
		
			//Write down the question.
			System.out.print("Ingrese número de entradas para adultos: ");
		
			//The scanner reads the user's answer.
			entAdu = reader.nextInt();
		
			//Calculate the variable.
			entInf *= PRE_INF;
			entAdu *= PRE_ADU;
			total = entInf + entAdu;
		
			//Conditional.
			total = total > 100 ? total - total * 5 / 100 : total;
		
			//Show the answer.
			System.out.print("Precio a pagar: " + total + "€");
		
			//Turn off/Close the scanner.
			reader.close();

	}

}
