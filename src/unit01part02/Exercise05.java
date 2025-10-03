package unit01part02;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
		//Set the variables.
		int sec;
		int min;
		int hour;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
			//Write down the question.
			System.out.print("Ingrese segundos: ");
		
			//The scanner reads the user's answer.
			sec = reader.nextInt();
		
			//Calculate the variables.
			min = sec / 60;
			hour = min / 60;
		
			//Show the answer.
			System.out.println("Número de horas: " + hour);
			System.out.println("Número de minutos: " + min);
			System.out.println("Número de segundos: " + sec);
		
			//Turn off/Close the scanner.
			reader.close();

	}

}
