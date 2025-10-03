package unit01part02;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {

		//Set the variables.
		int ano;
		int siglo;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
			//Write down the question.
			System.out.print("Ingrese año: ");
		
			//The scanner reads the user's answer.
			ano = reader.nextInt();
		
			//Calculate the variable.
			siglo = ano / 100 + 1;
		
			//Show the answer.
			System.out.println("Siglo: " + siglo);
			
			//Turn off/Close the scanner
			reader.close();
		
	}

}
