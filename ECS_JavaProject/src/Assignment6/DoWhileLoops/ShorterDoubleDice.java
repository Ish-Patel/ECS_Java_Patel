package Assignment6.DoWhileLoops;

import java.util.Random;

public class ShorterDoubleDice 
{
	public static void main(String[] args)
	{
		Random rng = new Random();
		
		int d1, d2;
		d1 = 1;
		d2 = 0;
		
		System.out.println("DOUBLE DICE ROLLER");
		
		do 
		{
			d1 = 1 + rng.nextInt(6);
			d2 = 1 + rng.nextInt(6);
			
			System.out.println("Roll #1:" + d1);
			System.out.println("Roll #2:" + d2);
			System.out.println("Total:" + (d1 + d2));
			System.out.println(" ");
		} while (d1 == d2);
		
		
	}
}
