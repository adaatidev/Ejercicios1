package unit01part02;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {

		int number;
		int volumen;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		number = reader.nextInt();
		
		volumen = number / 100;
		
		System.out.print("Pertenece al volúmen " + volumen + ".");
		
		reader.close();
		
	}

}
