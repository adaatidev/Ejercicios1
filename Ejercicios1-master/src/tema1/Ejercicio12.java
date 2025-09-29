package tema1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		double manzanas;
		double peras;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduzca kilos de manzanas:");
		
		manzanas = reader.nextDouble();
		
		System.out.println("Introduzca kilos de peras:");
		
		peras = reader.nextDouble();
		
		System.out.println("Coste manzanas: " + manzanas * 2.35);
		
		System.out.println("Coste peras: " + peras * 1.95);
		
		reader.close();

	}

}
