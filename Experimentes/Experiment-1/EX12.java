//12.Write a program to find the sum of the digits of an integer using a while loop.

import java.util.Scanner;

public class EX12
{
	public static void main(String[] args) 
	{
  		Scanner sc = new Scanner(System.in);

     	System.out.print("Enter an integer: ");
     	int number = sc.nextInt();

     	int a = number;
     	int b = 0;

     	while (number != 0) 
		{
     	 	int digit = number % 10;
    		b += digit;
     		number /= 10;
    	}

   		System.out.println("The sum of digits of "+ a +" is: " + b);
    }
}
