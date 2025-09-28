package tema1;

import java.util.Scanner;

import java.util.Locale;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		double number1;
		
		double number2;
		
		final double suma;
		final double resta;
		final double divi;
		final double mul;
		
			Scanner reader = new Scanner(System.in);
			
			System.out.print("Ingrese un primer número mayor que el segundo:");
			
			number1 = reader.nextDouble();
			
			System.out.print("Ingrese un segundo número menor que el primero:");
			
			number2 = reader.nextDouble();
			
			suma = number1 + number2;
			
			resta = number1 - number2;
			
			divi = number1 / number2;
			
			mul = number1 * number2;
			
			System.out.println("Soluciones:");
			System.out.println("Solución suma:" + suma);
			System.out.println("Solución resta:" + resta);
			System.out.println("Solución división:" + divi);
			System.out.println("Solución multiplicación:" + mul);
			
			reader.close();
			
	}

}
