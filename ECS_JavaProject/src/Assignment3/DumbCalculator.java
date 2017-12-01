package Assignment3;

import java.util.Scanner;

public class DumbCalculator
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double one, two, three, avg;
		
		
		
		System.out.println("Let's find the average of a few numbers...");
		
		System.out.println("What is the first number?");
		one = keyboard.nextDouble();
		
		System.out.println("What is the second number?");
		two = keyboard.nextDouble();
		
		System.out.println("What is the third number?");
		three = keyboard.nextDouble();
		
		avg = (one + two + three) / 3;
		System.out.println("The average of the three numbers is "+avg+" ");
		
		keyboard.close();
	}
}
