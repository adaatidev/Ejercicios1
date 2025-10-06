package english01part02;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		//Set the variable for the price.
		double price;
		
		////Set the variable for the tax.
		int tax;
		
		//Set up the scanner.
		Scanner reader = new Scanner(System.in);
		
		//DISPLAY program title.
		System.out.print("English Program: TAX CALCULATOR");
		
		//DISPLAY prompt for price.
		System.out.print("Introduce the price: ");
		
		//ENTER price.
		price = reader.nextDouble();
		
		//DISPLAY prompt for tax.
		System.out.print("Introduce the tax: ");
		
		//ENTER tax.
		tax = reader.nextInt();
		
		//SET price TO price.
		price = price + price*tax/100;
		
		//DISPLAY new price.
		System.out.print("The new price, with tax is: " + price);
		
		//END.
		reader.close();
		
	}

}
