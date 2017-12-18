package Assignment8;

import java.util.Scanner;

public class MethodPass 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Number:");
		int a = keyboard.nextInt();
		div(a);
		
		keyboard.close();
	}
	public static void div(int x)
	{
		if (x%3 == 0)
			System.out.println("Kewl");
		else
			System.out.println("NO!!!");
	}
}
