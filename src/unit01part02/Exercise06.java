package unit01part02;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		//Set the variables.
		int mm;
		int cm;
		int m;
		double total;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
			//Write down the question.
			System.out.println("Ingrese medida en milímetros: ");
		
			//The scanner reads the user's answer.
			mm = reader.nextInt();
		
			//Write down the question.
			System.out.println("Ingrese medida en centímetros: ");
		
			//The scanner reads the user's answer.
			cm = reader.nextInt();
		
			//Write down the question.
			System.out.println("Ingrese medida en metros: ");
		
			//The scanner reads the user's answer.
			m = reader.nextInt();
		
			//Calculate the variable.
			mm /= 10;
			m = m * 100;
			total = m + cm + mm;
		
			//Show the answer.
			System.out.println("Medida pasada a cm: " + total);
		
			//Turn off/Close the scanner.
			reader.close();
		
	}

}