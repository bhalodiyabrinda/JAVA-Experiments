//8.Write a program to check whether a given number is odd or even.

import java.util.*;

class EX8
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);

		int a;
		System.out.println("Enter value of a:");
		a= sc.nextInt();

		if(a%2==0)
		{
			System.out.println(a+ "is even");
		}
		else
		{
			System.out.println(a+ "in odd");
		}
	}
}