package Assignment6.DoWhileLoops;

import java.util.Random;

import java.util.Scanner;

public class FlipAgain 
{
	public static void main(String[] args)
	{
		Random rng = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		String again;
		
		do
		{
			int flip = rng.nextInt(2);
			
			String coin;
			
			if (flip == 1)
				coin = "HEADS";
			else
				coin = "TAILS";
			
			System.out.println("You flip a coin and it is..." + coin);
			
			System.out.print("Would you like to flip again (y/n)");
			again = keyboard.next();
		} while (again.equals("y"));
		
		keyboard.close();
	}
}
