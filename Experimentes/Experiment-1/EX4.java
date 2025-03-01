//4.Write a program to calculate the area of Circle.

import java.util.*;
class EX4
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);

		float r;
		System.out.println("Enter value of r:");
		r= sc.nextFloat();

		float a =(r*r * 22/7);

		System.out.print("Area of Circle:"+a);
	}
}