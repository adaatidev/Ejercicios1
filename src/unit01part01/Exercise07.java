package unit01part01;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
	
		//Set the variables.
		String name;
		String home;
		int tlf;
		
		//Set up the scanner.
		Scanner reader = new Scanner(System.in);
			
			//Write down the question.
			System.out.print("Ingrese su nombre:");
			
			//The scanner reads the user's answer.
			name = reader.nextLine();
			
			//Write down the question.
			System.out.print("Ingrese su dirección:");
			
			//The scanner reads the user's answer.
			home = reader.nextLine();
			
			//Write down the question.
			System.out.print("Ingrese su teléfono:");
			
			//The scanner reads the user's answer.
			tlf = reader.nextInt();
			
			//Show the answers.
			System.out.println("Datos ingresados:");
			System.out.println("Nombre: " + name);
			System.out.println("Dirección: " + home);
			System.out.println("Teléfono: " + tlf);
			
			//Turn off/Close the scanner.
			reader.close();

	}

}