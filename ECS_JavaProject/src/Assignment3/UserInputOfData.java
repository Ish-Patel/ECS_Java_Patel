package Assignment3;

import java.util.Scanner;

public class UserInputOfData
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String first, last, log;
		int grade, id;
		double gpa;
		
		System.out.println("Please enter the following information so I can sell it for profit!");
		
		System.out.println("First name:");
		first = keyboard.next();
		
		System.out.println("Last name:");
		last = keyboard.next();
		
		System.out.println("Grade (9-12:)");
		grade = keyboard.nextInt();
		
		System.out.println("Student ID:");
		id = keyboard.nextInt();
		
		System.out.println("Login:");
		log = keyboard.next();
		
		System.out.println("GPA (0.0-4.0):");
		gpa = keyboard.nextDouble();
		
		System.out.println("Your information:");
		System.out.println("		Login: 	"+log+"");
		System.out.println("		ID: 	"+id+"");
		System.out.println("		Name: 	"+last+", "+first+"");
		System.out.println("		GPA: 	"+gpa+"");
		System.out.println("		Grade:	"+grade+"");

		keyboard.close();
	}
}
