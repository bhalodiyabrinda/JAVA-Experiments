//22.Demonstrate the usage of Switch ... .Case and implement a calculator to do basic operations.

import java.util.*;

public class EX22 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice;
        System.out.print("Enter your choice : ");
        choice = sc.nextInt();

        double num1;
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        double num2;
        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Result: " + result);
    }
}
