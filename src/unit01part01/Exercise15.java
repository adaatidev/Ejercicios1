package unit01part01;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		
		final int IVA = 21;
		double precio;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Ingrese precio: ");
		
		precio = reader.nextDouble();
		
		System.out.print("Precio final con IVA: " + ((precio * IVA / 100) + precio));
		
		reader.close();

	}

}
