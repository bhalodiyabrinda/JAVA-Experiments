//9.Write a program to find out the average of a set of integers numbers.

import java.util.*;

class EX9
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);

		int a;
		System.out.println("Enter value of a:");
		a= sc.nextInt();

		int b;
		System.out.println("Enter value of b:");
		b= sc.nextInt();
		
		int c;
		System.out.println("Enter value of c:");
		c= sc.nextInt();

		double d=((a+b+c)/3);
		System.out.println("values="+d);
	}
}