package unit01part01;

import java.util.Scanner;

import java.util.Locale;

public class Exercise05 {

	public static void main(String[] args) {
		
		double radio;
		
		final double longi;
		final double area;
		
			Scanner reader = new Scanner(System.in);
			
			System.out.print("Radio de circunferencia:");
			
			radio = reader.nextDouble();
			
			longi = 2 * Math.PI * radio;
			area = Math.PI * radio * radio;
			
			System.out.println("Longitud de la circunferencia:" + longi);
			System.out.print("Área de la circunferencia:" + area);
			
			reader.close();
		
	}

}
