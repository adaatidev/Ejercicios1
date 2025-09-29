package unit001part001;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		double apple;
		double pear;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Ingrese peso de manzanas: ");
		
		apple = reader.nextDouble();
		
		System.out.print("Ingrese peso de peras: ");
		
		pear = reader.nextDouble();
		
		System.out.println("Precio de las manzanas: " + apple * 2.35);
		
		System.out.print("Precio de las peras: " + pear * 1.95);
		
		reader.close();
		
	}

}
