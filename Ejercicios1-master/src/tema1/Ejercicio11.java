package tema1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		int pesetas;
		
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Introduzca número de pesetas:");
		
		pesetas = reader.nextInt();
		
		System.out.print("Pesetas a euros:" + pesetas / 166);
		
		reader.close();

	}

}
