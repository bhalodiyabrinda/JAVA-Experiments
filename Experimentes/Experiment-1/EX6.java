//6.Write a program to calculate the area of a rectangle.

import java.util.*;

class EX6
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);

		float a;
		System.out.println("Enter value of a:");
		a= sc.nextFloat();

		float b;
		System.out.println("Enter value of b:");
		b= sc.nextFloat();

		float c =(a*b);

		System.out.print("Area of rectangle:"+c);
	}
}
