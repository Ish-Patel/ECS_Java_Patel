package Assignment5;

import java.util.Random;

import java.util.Scanner;

public class HiLow 
{
	public static void main(String[] args)
	{
		Random r = new Random();
		
		Scanner keyboard = new Scanner(System.in);
		
		int random, guess;
		
		random = r.nextInt(100);
		
		System.out.println("I'm thinking of a number between 1-100. Try to guess it");
		System.out.print(">");
		guess = keyboard.nextInt();
		
		if ( guess > random )
			System.out.println("Too High");
		else if ( guess < random )
			System.out.println("Too Low");
		else
			System.out.println("Correct");
	
		System.out.println("The number was "+random+"");
		
		keyboard.close();
	}
}
