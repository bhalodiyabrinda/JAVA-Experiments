//7.Write a program to calculate the area of a square.

import java.util.*;

class EX7
{
	public static void main (String args[])
		{
			Scanner sc = new Scanner(System.in);

			float a;
			System.out.println("Enter value of a:");
			a= sc.nextFloat();

			float c =(a*a);

			System.out.print("Area of square:"+c);
	}
}
