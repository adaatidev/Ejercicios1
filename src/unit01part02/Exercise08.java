package unit01part02;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		double m;
		double cm;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Ingrese longitud en metros: ");
		m = reader.nextDouble();
		
		cm= m*100;
		
		cm = (int) cm;
		
		System.out.print("Longitud en centímetros: " + cm);
		
		reader.close();
		
	}

}
