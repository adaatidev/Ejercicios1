package unit01part02;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		int mm;
		int cm;
		int m;
		double total;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ingrese medida en milímetros: ");
		mm = reader.nextInt();
		System.out.println("Ingrese medida en centímetros: ");
		cm = reader.nextInt();
		System.out.println("Ingrese medida en metros: ");
		m = reader.nextInt();
		
		mm /= 10;
		
		m = m * 100;
		
		total = m + cm + mm;
		
		System.out.println("Medida pasada a cm: " + total);
		
		reader.close();
		
	}

}