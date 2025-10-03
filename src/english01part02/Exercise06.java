package english01part02;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		int students;
		int groups;
		int tstu;
		int tgro;

		Scanner reader = new Scanner(System.in);
		
		System.out.print("How many students?: ");
		students = reader.nextInt();
		
		System.out.print("How many groups?: ");
		groups = reader.nextInt();
		
		tgro = students / groups;
		
		tstu = students % groups;
		
		System.out.println("Number of groups: " + tgro);
		System.out.print("Number of students left out of the group: " + tstu);
		
		reader.close();
		
	}

}
