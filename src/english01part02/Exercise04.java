package english01part02;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		double lb;
		double kg;
		final double lbn = 2.2;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter pounds: ");
		lb = reader.nextDouble();
		
		kg = lb / lbn;
		
		System.out.print("Lb to kg: " + kg);
		
		reader.close();
		
	}

}
