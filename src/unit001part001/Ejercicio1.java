package unit001part001;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Enter the variable
		int number;
		
		//Set a scanner for reading the user answer
		Scanner reader = new Scanner(System.in);
		
			//Write down the question
			System.out.print("Número a ingresar:");
			
			//The scanner starts reading the user's answer and it converts into number (the variable)
			number = reader.nextInt();
			
			//Shows the answer
			System.out.println("Número ingresado:" + number);
			
			//Turn off the scanner
			reader.close();
		
	}

}