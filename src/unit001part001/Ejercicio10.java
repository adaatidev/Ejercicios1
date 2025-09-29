package unit001part001;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int number;
		boolean par;
		
		Scanner reader = new Scanner(System.in);
		
			System.out.print("Ingrese número: ");
		
			number = reader.nextInt();
		
			par = number % 2 == 0;
				
			System.out.print("Es par: " + par);
		
			reader.close();

	}

}
