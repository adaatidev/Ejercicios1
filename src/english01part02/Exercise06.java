package english01part02;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		//Set the variable for the students.
		int students;
		
		//Set the variable for the groups.
		int groups;
		
		//Set the variable for the total groups.
		int tStu;
		
		//Set the variable for the total students.
		int tGro;

		//Set up the scanner for reading the user's keyboard.
		Scanner reader = new Scanner(System.in);
		
		//Ask the question, how many students are in the class.
		System.out.print("How many students?: ");
		
		//The scanner reads the answer.
		students = reader.nextInt();
		
		System.out.print("How many groups?: ");
		
		//The scanner reads the answer.
		groups = reader.nextInt();
		
		//Calculate how many groups are going to be formed.
		tGro = students / groups;
		
		//Calculate how many students are left without a team.
		tStu = students % groups;
		
		//Show the answers.
		System.out.println("Number of groups: " + tGro);
		System.out.print("Number of students left out of the group: " + tStu);
		
		//Close the scanner.
		reader.close();
		
	}

}