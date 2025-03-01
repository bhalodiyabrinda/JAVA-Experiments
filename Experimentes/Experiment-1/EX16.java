//16.Write a program to display the sum of n numbers using an array

import java.util.*;

public class EX16 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
			
		int n;
        System.out.print("Enter the value of n: ");
        n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) 
		{
            sum += numbers[i];
        }

        System.out.println("Sum of the " + n + " numbers is: " + sum);
    }
}

