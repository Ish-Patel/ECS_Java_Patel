package Assignment7;

import java.util.Scanner;

public class AddingValuesForLoop
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Count To:");
		int ct = keyboard.nextInt();
		int t = 0;
		
		for (int n = 1; n <= ct; n++)
		{
			System.out.print(" "+n);
			t = t+n;
		}
		System.out.println("");
		System.out.println("Sum: "+t);
		
		keyboard.close();

	}
}
