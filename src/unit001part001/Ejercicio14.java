package unit001part001;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		int nota1;
		int nota2;
		int nota3;
		int bolet;
		double expaca;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Ingrese nota del primer trimestre: ");
		
		nota1 = reader.nextInt();
		
		System.out.print("Ingrese nota del segundo trimestre: ");
		
		nota2 = reader.nextInt();
		
		System.out.print("Ingrese nota del tercer trimestre: ");
		
		nota3 = reader.nextInt();
		
		bolet = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Boletín de calificaciones: " + bolet);
		
		expaca = (nota1 + nota2 + nota3) / 3.0;
		
		System.out.print("Expediente académico: " + expaca);
		
		reader.close();

	}

}
