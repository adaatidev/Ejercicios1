package unit01part02;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {

		//Set the variables.
		int number;
		int volumen;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
			//Write down the question.
			System.out.print("Ingrese número: ");
			
			//The scanner reads the user's answer.
			number = reader.nextInt();
		
			//Calculate the variable.
			volumen = number / 100;
		
			//Show the answer.
			System.out.print("Pertenece al volúmen " + volumen + ".");
		
			//Turn off/Close the scanner.
			reader.close();
		
	}

}
