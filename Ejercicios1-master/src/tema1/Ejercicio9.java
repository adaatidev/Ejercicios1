package tema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int age;
		boolean mayor;
		
		Scanner reader = new Scanner(System.in);
		
			System.out.print("Ingrese su edad:");
			
			age = reader.nextInt();
		
			mayor = (age >= 18);
		
			System.out.print("Mayor de edad:" + mayor);
			
			reader.close();
			
	}

}