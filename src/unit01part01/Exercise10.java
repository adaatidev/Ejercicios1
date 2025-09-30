package unit01part01;

import java.util.Scanner;

public class Exercise10 {

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
