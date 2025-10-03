package unit01part01;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		//Set the variables.
		int age;
		String name;
		
		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
			//Write down the question.
			System.out.println("Ingrese su nombre:");
		
			//The scanner reads the user's answer.
			name = reader.nextLine();
		
			//Write down the question.
			System.out.println("Ingrese su edad:");
			
			//The scanner reads the user's answer.
			age = reader.nextInt();
		
			//Show the answer.
			System.out.println("Hola " + name + ", tienes " + age + ", ¡qué mayor eres!.");
		
			//Turn off/Close the scanner.
			reader.close();
		
	}

}
