//21.Write a program to find the Nth term in a Fibonacci series using recursion and without recursion.

import java.util.Scanner;

public class EX21 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter the value of N: ");
        n = sc.nextInt();

        System.out.println("Using Recursion:");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }
        System.out.println();

        System.out.println("Using Iteration:");
        for (int i = 1; i <= n; i++) {
            System.out.print( fibonacciIteration(i) + " ");
        }
    }

    public static int fibonacciRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    public static int fibonacciIteration(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            a = b + c;
            c = b;
            b = a;
        }
        return a;
    }
}

