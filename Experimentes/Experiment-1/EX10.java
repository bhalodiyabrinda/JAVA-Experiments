//10.Write a program to find the product of real numbers.

import java.util.*;

class EX10
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);

		double num1;
		System.out.println("Enter value of num1:");
		num1= sc.nextDouble();

		double num2;
		System.out.println("Enter value of num2:");
		num2= sc.nextDouble();

		double sum=(num1 * num2);
		System.out.println("The sum of " +num1  +"and" +num2 +"is: " +sum);
	}
}		

