package Assignment5;

import java.util.Random;

public class Dice 
{
	public static void main(String[] args)
	{
		Random r = new Random();
		
		int d1, d2;
		
		d1 = 1+ r.nextInt(6);
		d2 = 1+ r.nextInt(6);
		
		System.out.println("DICE ROLLER");
		
		System.out.println("Roll #1:" + d1);
		System.out.println("Roll #2:" + d2);
		System.out.println("Total:" + (d1 + d2));
	}
}
