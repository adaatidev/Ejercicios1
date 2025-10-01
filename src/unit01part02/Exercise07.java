package unit01part02;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		//Set the variables.
		int entInf;
		int entAdu;
		final double PRE_INF = 15.50;
		final double PRE_ADU = 20;
		double total;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Ingrese número de entradas infantiles: ");
		entInf = reader.nextInt();
		
		System.out.print("Ingrese número de entradas para adultos: ");
		entAdu = reader.nextInt();
		
		entInf *= PRE_INF;
		entAdu *= PRE_ADU;
		
		total = entInf + entAdu;
		
		total = total > 100 ? total - total * 5 / 100 : total;
		
		System.out.print("Precio a pagar: " + total + "€");
		
		reader.close();

	}

}
