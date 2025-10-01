package unit01part02;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {

		int ano;
		int siglo;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Ingrese año: ");
		ano = reader.nextInt();
		
		siglo = ano / 100 + 1;
		
		System.out.println("Siglo: " + siglo);
		
		reader.close();
		
	}

}
