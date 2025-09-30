package unit01part01;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		
		double peseta;

		Scanner reader = new Scanner(System.in);
		
		System.out.print("Ingrese número de pesetas: ");
		
		peseta = reader.nextDouble();
		
		System.out.print("Pasado a euros: " + peseta / 166);
		
		reader.close();
		
	}
}