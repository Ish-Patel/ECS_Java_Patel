package Assignment7;

import java.util.Scanner;

public class Task1 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Type a message and I will display it 5 times.");
		System.out.print("Message: ");
		String message = keyboard.nextLine();
		
		for (int n = 2 ; n <= 20 ; n = n+3)
			System.out.println(n+") "+message);
		
		keyboard.close();
	}
}
