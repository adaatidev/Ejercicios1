package tema1;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		int String;
		
		String rain;
		String hw;
		String library;
		
		boolean con;
		
		Scanner reader = new Scanner (System.in);
		
		System.out.println("¿Llueve?: ");
		
		rain = reader.nextLine();
		
		System.out.println("¿Has hecho los deberes?: ");
		
		hw = reader.nextLine();
		
		System.out.println("¿Tienes que ir a la biblioteca?: ");
		
		library = reader.nextLine();
		
		con = (rain = "no" + hw = "si" + library = "si");
		
		System.out.println("¿Vas a salir?: ");
		
		reader.close();

	}

}
