package unit01part01;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		
		//Write down the variables.
		boolean rain;
		boolean hw;
		boolean lib;
		boolean out;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
			//Write down the question.
			System.out.print("¿Está lloviendo?: ");
		
			//The scanner reads the user's answer.
			rain = reader.nextBoolean();
		
			//Write down the question.
			System.out.print("¿Has hecho la tarea?: ");
		
			//The scanner reads the user's answer.
			hw = reader.nextBoolean();
		
			//Write down the question.
			System.out.print("¿Tienes que ir a la biblioteca?: ");
			
			//The scanner reads the user's answer.
			lib = reader.nextBoolean();
		
			//Calculate the boolean.
			out = (!rain && hw || lib);
		
			//Show the answer.
			System.out.print("Sales: " + out);
		
			//Turn off/Close the scanner.
			reader.close();

	}

}