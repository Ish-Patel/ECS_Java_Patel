package Assignment6.DoWhileLoops;

import java.util.Scanner;

public class CollatzSequence 
{
	public static void main(String[] args)
	{
			Scanner keyboard = new Scanner(System.in);
			
			int n = 0;
			
			System.out.println("COLLAT SEQENCE");
			System.out.println("");
			System.out.println("Rules:");
			System.out.println("Even	- 	x/2");
			System.out.println("Odd	-	(x*3)+1");
			System.out.println("");
			System.out.print("Starting Number:");
			n = keyboard.nextInt();
			
			System.out.print("["+ n +" - ");
			
			do
			{
				if (n % 2 == 0)
					n = n/2;
				else
					n = (n*3)+1;
				System.out.print(n+" - ");
			} while (n != 1);
			
			System.out.print("]");
			
			keyboard.close();
		}
}
