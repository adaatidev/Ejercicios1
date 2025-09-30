package unit01part01;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Enter the variable of the current year
		int currentYear;
		
		//Enter the variable of the birth year
		int birthYear;
		
		Scanner reader = new Scanner(System.in);
		
			System.out.print("¿En qué año está?");
			
			currentYear = reader.nextInt();
			
			System.out.print("¿En qué año nació?");
			
			birthYear = reader.nextInt();
			
			System.out.print("Edad:" + (currentYear - birthYear));
			
			reader.close();
			
	}

}
