package unit01part02;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
		//Set the variables.
		int sec;
		int min;
		int hour;
		
		//Set up the scanner.
		Scanner reader = new Scanner(System.in);
		
		
		System.out.print("Ingrese segundos: ");
		sec = reader.nextInt();
		
		min = sec / 60;
		hour = min / 60;
		
		System.out.println("Número de horas: " + hour);
		System.out.println("Número de minutos: " + min);
		System.out.println("Número de segundos: " + sec);
		
		reader.close();

	}

}
