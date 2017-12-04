package Assignment4;

import java.util.Scanner;

public class SpaceBoxing
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double v, m, j, s, u, n, e, planet;
		
		System.out.print("Please enter your currnet earth weight:");
		e = keyboard.nextDouble();
		
		v = e * 0.78;
		m = e * 0.39;
		j = e * 2.65;
		s = e * 1.17;
		u = e * 1.05;
		n = e * 1.23;
		
		System.out.println("I have your information for the following planets:");
		System.out.println("	1. Venus	2. Mars		3. Jupiter");
		System.out.println("	4. Saturn	5. Uranus	6. Neptune");
		
		System.out.print("Which planet are you visiting?");
		planet = keyboard.nextInt();
		
		if(planet == 1)
			System.out.println("Your weight would be "+v+" lbs on that planet.");
		if(planet == 2)
			System.out.println("Your weight would be "+m+" lbs on that planet.");
		if(planet == 3)
			System.out.println("Your weight would be "+j+" lbs on that planet.");
		if(planet == 4)
			System.out.println("Your weight would be "+s+" lbs on that planet.");
		if(planet == 5)
			System.out.println("Your weight would be "+u+" lbs on that planet.");
		if(planet == 6)
			System.out.println("Your weight would be "+n+" lbs on that planet.");
		
		keyboard.close();
	}
}
