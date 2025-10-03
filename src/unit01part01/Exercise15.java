package unit01part01;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		
		//Set the variables.
		final int IVA = 21;
		double precio;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
			//Write down the question.
			System.out.print("Ingrese precio: ");
		
			//The scanner reads the user's answer.
			precio = reader.nextDouble();
		
			//Calculate the variable.
			precio = (precio * IVA / 100) + precio;
			
			//Show the answer.
			System.out.print("Precio final con IVA: " + precio);
		
			//Turn off/Close the scanner.
			reader.close();

	}

}
