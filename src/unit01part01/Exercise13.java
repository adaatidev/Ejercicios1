package unit01part01;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		
		boolean rain;
		boolean hw;
		boolean lib;
		boolean out;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("¿Está lloviendo?: ");
		rain = reader.nextBoolean();
		
		System.out.print("¿Has hecho la tarea?: ");
		hw = reader.nextBoolean();
		
		System.out.print("¿Tienes que ir a la biblioteca?: ");
		lib = reader.nextBoolean();
		
		out = (!rain && hw);
		
		System.out.print("Sales: " + out);
		
		reader.close();

	}

}