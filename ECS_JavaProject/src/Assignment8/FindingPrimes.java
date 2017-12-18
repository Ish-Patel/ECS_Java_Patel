package Assignment8;

import java.util.Scanner;

public class FindingPrimes 

{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		boolean pri = false;
		
		System.out.print("Prime From: ");
		int cf = keyboard.nextInt();
		System.out.print("Prime To: ");
		int ct = keyboard.nextInt();
		
		for (int n = cf; n <= ct; n = n + 1)
		{
			System.out.print(" "+n);
			pri = prime(n);
			
			
			if (pri == true)
				System.out.println("<");
			else
				System.out.println(" ");
			
		}
		
		keyboard.close();
	}

	private static boolean prime(int x) 
	{
		for(int i = 2 ; i <= x-1 ;i = i+1) 
		{
	        if(x%i==0)
	        {
	            return false;
	        }
	        	
	    }
		
	    return true;
	}
}

