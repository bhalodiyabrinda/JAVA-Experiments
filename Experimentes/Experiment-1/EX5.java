//5.Write a program to calculate the area of a triangle.

import java.util.*;

class EX5
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

			float c =(a*b * 1/2);

			System.out.print("Area of triangle:"+c);
	}
}
