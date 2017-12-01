package Assignment3;

import java.util.Scanner;

public class AgeIn5
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age, ageplus, ageminus;
		
		System.out.println("Hello. What is your name?");
		name = keyboard.next();
		
		System.out.println("Hi, "+name+"! How old are you?");
		age = keyboard.nextInt();
		
		ageplus = age + 5;
		ageminus = age - 5;
		
		System.out.println("Did you know that in five years you will be "+ageplus+" years old?");
		System.out.println("And five years ago you were "+ageminus+"! Imagine that!");
		
		keyboard.close();
	}
}
