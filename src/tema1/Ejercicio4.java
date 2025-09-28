package tema1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

	double nota1;
	
	double nota2;
	
	final double notaFinal;
	
		Scanner reader = new Scanner(System.in);
	
		System.out.print("Ingrese su primera nota:");
		
		nota1 = reader.nextDouble();
		
		System.out.print("Ingrese su segunda nota:");
		
		nota2 = reader.nextDouble();
		
		notaFinal = (nota1 + nota2) / 2;
		
		System.out.print("Nota media:" + notaFinal);
		
	}

}
