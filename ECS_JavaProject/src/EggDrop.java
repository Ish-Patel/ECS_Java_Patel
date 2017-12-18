import java.util.Scanner;

import java.util.Random;

public class EggDrop 

{
	public static void main(String[] args)
	{
		Random rng = new Random();
		Scanner key = new Scanner(System.in);
		
		int n = rng.nextInt(100) + 1;
		int c = 0;
		int egg = 2;
		int m = 0;
		
		System.out.print("Maximum(0 for random):");
		int op = key.nextInt();
		
		if (op == 0)
			m = n;
		else
			m = op;
		
		
		while (egg > 0)
		{
			System.out.print((c + 1) + ">");
			int guess = key.nextInt();
		
			if ( guess == m)
				System.out.println("Correct");
			else if ( guess < m )
				System.out.println("Incorrct");
			else if (guess > m)
			{
				System.out.println("Break");
				egg = egg - 1;
			}
			
			c++;
		}
		
		key.close();

	}
}
