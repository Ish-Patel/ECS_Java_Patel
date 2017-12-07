package Assignment7;

import java.util.Scanner;

public class CountingMachine 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Count To:");
		int ct = keyboard.nextInt();
		
		for (int n = 1; n <= ct; n++)
		{
			System.out.print(" "+n);
		}
		
		keyboard.close();
	}
}
