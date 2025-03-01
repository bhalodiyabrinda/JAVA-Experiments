//11.Write a program to check whether the given integer number is a multiple of 5.

import java.util.*;

class EX11
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);

		int a;
		System.out.println("Enter value of a:");
		a= sc.nextInt();

		if(a%5==0)
		{
			System.out.println(a+" is a multiple of 5");
		}
		else
		{
			System.out.println(a+" is not a multiple of 5");
		}
	}
}