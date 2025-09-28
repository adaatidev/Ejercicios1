package tema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int String;
		int age;
		
		String name;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre:");
		
		name = reader.nextLine();
		
		System.out.println("Ingrese su edad:");
		
		age = reader.nextInt();
		
		System.out.println("Hola " + name + ", tienes " + age + ", ¡qué mayor eres!.");
		
		reader.close();

	}

}
