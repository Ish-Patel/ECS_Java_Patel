package Assignment6.WhileLoops;

import java.util.Random;
import java.util.Scanner;

public class KeepGuessing 
{
	public static void main (String[] args)
	{
		Random rng = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		int g = 0;
		int n = 1 + rng.nextInt(10);
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		
		while ( n != g)
		{
			System.out.print("Your guess:");
			g = keyboard.nextInt();
			System.out.println("The number was " + n);
		}
		
		System.out.println("Correct");
		
		keyboard.close();
		
	}
}
