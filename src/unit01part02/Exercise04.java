package unit01part02;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int x;
		
		//Set up the scanner.
		Scanner reader = new Scanner(System.in);
		
		//Ask the questions.
		System.out.print("Ingrese valor para a: ");
		a = reader.nextInt();
		
		System.out.print("Ingrese valor para b: ");
		b = reader.nextInt();
		
		System.out.print("Ingrese valor para c: ");
		c = reader.nextInt();
		
		System.out.print("Ingrese valor para x: ");
		x = reader.nextInt();
		
		System.out.println("Polinomio de segundo grado: y= " + a + ("*") + x + ("^2+") + b + ("*") + x + ("+") + c);
		
		reader.close();
	}

}