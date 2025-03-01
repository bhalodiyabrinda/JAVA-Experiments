//3.Write a program to convert the temperature in Centigrade to Fahrenheit.

import java.util.*;

class EX3
{
	public static void main (String args[])
		{
			Scanner sc = new Scanner(System.in);

			double C;
			System.out.print("Enter the temperature in Celsius:");
			C= sc.nextDouble();

			double F=(C * 9/5)+32;

			System.out.print("Centigrade:"+C+"= Fahrenheit:"+F);
		}
}










