package unit01part01;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {

		//Set the variables.
		double apple;
		double pear;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
			//Write down the question.
			System.out.print("Ingrese peso de manzanas: ");
		
			//The scanner reads the user's answer.
			apple = reader.nextDouble();
		
			//Write down the question.
			System.out.print("Ingrese peso de peras: ");
		
			//The scanner reads the user's answer.
			pear = reader.nextDouble();
		
			//Calculate the variables.
			apple *= 2.35;
			pear *= 1.95;
		
			//Show the answer.
			System.out.println("Precio de las manzanas: " + apple);
			System.out.print("Precio de las peras: " + pear);
		
			//Turn off/Close the scanner.
			reader.close();
			
	}

}
