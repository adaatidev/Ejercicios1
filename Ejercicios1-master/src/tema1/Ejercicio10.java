package tema1;

import java.util.Scanner;

public class Ejercicio10 {
	
	public static void main(String[] args) {

		int number;
		
		boolean par;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Introduzca un número:");
		
		number = reader.nextInt();
		
		par = number % 2 == 0;
		
		System.out.print("Número par:" + par);

		reader.close();
		
	}	
}