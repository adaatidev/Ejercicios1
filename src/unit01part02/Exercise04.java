package unit01part02;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		//Set the variables.
		int a;
		int b;
		int c;
		int x;
		int y;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
			//Write down the question.
			System.out.print("Ingrese valor para a: ");
		
			//The scanner reads the user's answer.
			a = reader.nextInt();
		
			//Write down the question.
			System.out.print("Ingrese valor para b: ");
		
			//The scanner reads the user's answer.
			b = reader.nextInt();
		
			//Write down the question.
			System.out.print("Ingrese valor para c: ");
		
			//The scanner reads the user's answer.
			c = reader.nextInt();
		
			//Write down the question.
			System.out.print("Ingrese valor para x: ");
		
			//The scanner reads the user's answer.
			x = reader.nextInt();
		
			//Show the answer.
			System.out.println("Polinomio de segundo grado: y= " + a + ("*") + x + ("^2+") + b + ("*") + x + ("+") + c);
		
			//Turn off/Close the scanner.
			reader.close();
	}

}