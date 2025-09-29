package unit001part001;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		double peseta;

		Scanner reader = new Scanner(System.in);
		
		System.out.print("Ingrese número de pesetas: ");
		
		peseta = reader.nextDouble();
		
		System.out.print("Pasado a euros: " + peseta / 166);
		
		reader.close();
		
	}
}