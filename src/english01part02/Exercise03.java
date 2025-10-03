package english01part02;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		int length;
		int height;
		int area;

		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter the value for the length: ");
		length = reader.nextInt();
		
		System.out.print("Enter the value for the height: ");
		height = reader.nextInt();
		
		area = length * height;
		
		System.out.print("Area of the rectangle: " + area);
		
		reader.close();
		
	}

}
