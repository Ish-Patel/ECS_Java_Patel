package Assignment8;

import java.util.Scanner;

public class Keychains 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int stop = 0;
		int keys = 0;
		
		while (stop == 0)
		{
			System.out.println("______________________________");
			System.out.println("\tKeychain Shop");
			System.out.println("1) Add Chains");
			System.out.println("2) Subtract Chains");
			System.out.println("3) View Current Order");
			System.out.println("4) Checkout");
			System.out.println("______________________________");
			System.out.print("Option:");
			int c = keyboard.nextInt();
			System.out.println("______________________________");
			keys = option(c, keys);
			

			if (c == 4)
			{
				System.out.println("CHECKOUT");
				System.out.print("Name:");
				String name = keyboard.next();
				System.out.println(" ");
				System.out.println("Keychain(s):" + keys);
				System.out.println("Keychains are $10 ea.");
				System.out.println("Total Cost: $" + keys*10);
				System.out.println("Good Bye " + name);
				
				stop = 1;
			}
			
			else	 if ( c != 3 && c != 2 && c != 1)
			{
				System.out.println("_____________ERROR____________");
				stop = 1;
			}

		}
		
		keyboard.close();
	}

	public static int option(int c, int n) {
		
		Scanner sc = new Scanner(System.in);
		
		
		if (c == 1)
		{
			System.out.print("Plus:");
			int p = sc.nextInt();
			n = one(n, p);
			System.out.println("Keychain(s):" + n);
		}
			
		else if (c == 2)
		{
			System.out.print("Minus:");
			int m = sc.nextInt();
			n = two(n, m);
			System.out.println("Keychain(s):" + n);
		}
			
		else if (c == 3)
		{
			n = three(n);
			System.out.println("Keychain(s):" + n);
		}
		
				
		return n;
	}

	public static int one(int x, int y) {
		x = x + y;
		return x;
	}

	public static int two(int x, int y) {
		x = x - y;
		return x;
	}

	public static int three(int x) {
		x = x * 1;
		return x;
	}

	public static int four(int x) {
		x = 0;
		return x;
		
	}
}
