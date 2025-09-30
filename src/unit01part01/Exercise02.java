package unit01part01;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		//Enter the variable
		int age;
		
		//Set a scanner for reading the user answer
		Scanner reader = new Scanner(System.in);
		
			//Write down the question
			System.out.print("Ingrese su edad:");
			
			//The scanner starts reading the user's answer and it converts into age (the variable)
			age = reader.nextInt();
			
			//Shows the answer
			System.out.println("Su edad dentro de un año:" + (age + 1));
			
			//Turn off the scanner
			reader.close();
		
	}

}
