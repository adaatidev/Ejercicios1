package unit01part01;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
		//Set the variables.
		double radio;
		final double longi;
		final double area;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
			
			//Write down the question.
			System.out.print("Radio de circunferencia: ");
			
			//The scanner reads the user's answer.
			radio = reader.nextDouble();
			
			//Calculate the variables.
			longi = 2 * Math.PI * radio;
			area = Math.PI * radio * radio;
			
			//Show the answers.
			System.out.println("Longitud de la circunferencia: " + longi);
			System.out.print("Área de la circunferencia: " + area);
			
			//Turn off/Close the scanner.
			reader.close();
		
	}

}