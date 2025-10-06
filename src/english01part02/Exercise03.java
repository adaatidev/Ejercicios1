package english01part02;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Set the variable for the lenght.
		int length;
		
		//Set the variable for the height.
		int height;
		
		//Set the variable for the area.
		int area;

		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
		//Display the question for the lenght.
		System.out.print("Enter the value for the length: ");
		
		//The scanner reads the answer.
		length = reader.nextInt();
		
		//Display the question for the height.
		System.out.print("Enter the value for the height: ");
		
		//The scanner reads the answer.
		height = reader.nextInt();
		
		//Calculate the area.
		area = length * height;
		
		//Show the answer.
		System.out.print("Area of the rectangle: " + area);
		
		//Close the scanner.
		reader.close();
		
	}

}