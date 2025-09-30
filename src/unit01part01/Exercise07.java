package unit01part01;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		int Strings;
		
			String name;
			String home;
			String tlf;
		
			Scanner reader = new Scanner(System.in);
			
			System.out.println("Ingrese su nombre:");
			
			name = reader.nextLine();
			
			System.out.println("Ingrese su dirección:");
			
			home = reader.nextLine();
			
			System.out.println("Ingrese su teléfono:");
			
			tlf = reader.nextLine();
			
			System.out.println("Datos ingresados:");
			System.out.println("Nombre:" + name);
			System.out.println("Dirección:" + home);
			System.out.println("Teléfono:" + tlf);
			
			reader.close();

	}

}
