package english01part02;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		int age;
		int year;

		Scanner reader = new Scanner(System.in);
		
		System.out.print("How old are you?: ");
		age = reader.nextInt();
		
		year = 2025 - age;
		
		System.out.print("The year you were born: " + year);
		
		reader.close();
		
	}

}
