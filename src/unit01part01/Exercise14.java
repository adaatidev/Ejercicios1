package unit01part01;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		
		//Set the variables.
		int nota1;
		int nota2;
		int nota3;
		int bolet;
		double expaca;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
			//Write down the question.
			System.out.print("Ingrese nota del primer trimestre: ");
		
			//The scanner reads the user's answer.
			nota1 = reader.nextInt();
		
			//Write down the question.
			System.out.print("Ingrese nota del segundo trimestre: ");
			
			//The scanner reads the user's answer.
			nota2 = reader.nextInt();
		
			//Write down the question.
			System.out.print("Ingrese nota del tercer trimestre: ");
	
			//The scanner reads the user's answer.
			nota3 = reader.nextInt();
		
			//Calculate the variables
			bolet = (nota1 + nota2 + nota3) / 3;
			expaca = (nota1 + nota2 + nota3) / 3.0;
		
			//Show the answers.
			System.out.println("Boletín de calificaciones: " + bolet);
			System.out.print("Expediente académico: " + expaca);
		
			//Turn off/Close the scanner.
			reader.close();

	}

}
