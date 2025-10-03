package unit01part01;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		
		//Set the variables.
		int number;
		boolean par;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
			
			//Write down the question.
			System.out.print("Ingrese número: ");
		
			//The scanner reads the user's answer.
			number = reader.nextInt();
			
			//Calculate the boolean.
			par = number % 2 == 0;
				
			//Show the answer.
			System.out.print("Es par: " + par);
			
			//Turn off/Close the scanner.
			reader.close();

	}

}
