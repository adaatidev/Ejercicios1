package unit01part02;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		//Set the variables.
		double m;
		double cm;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
			//Write down the question.
			System.out.print("Ingrese longitud en metros: ");
		
			//The scanner reads the user's answer.
			m = reader.nextDouble();
		
			//Calculate the variable.
			cm= m*100;
			cm = (int) cm;
		
			//Show the answer.
			System.out.print("Longitud en centímetros: " + cm);
		
			//Turn off/Close the scanner.
			reader.close();
		
	}

}
