//14. Write a program to check whether the given number is prime or not.

import java.util.*;

public class EX14 
{
	public static void main(String[] args) 
	{
  		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("Enter a number: ");
     	num = sc.nextInt();

    	boolean a = true;

    	if (num <= 1) 
		{
     		a = false;
    	} 
		else 
		{
    		for (int i = 2; i <= Math.sqrt(num); i++) 
			{
    			if (num % i == 0) 
				{
          			a = false;
            		break;
				}
       		}
    	}

        if (a) 
		{
           System.out.println(num + " is a prime number");
       	} 
		else
		{
        	System.out.println(num + " is not a prime number");
        }
    }
}