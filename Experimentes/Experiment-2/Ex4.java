/*4. Write a Java Program to Find Area of Square, Rectangle and Circle using 
Method Overloading.*/

import java.util.Scanner;

public class Ex4 
{
    public static double calculateArea(double side)   
    {
        return side * side;
    }

    public static double calculateArea(double length, double width) 
    {
        return length * width;
    }

    public static double calculateArea(double radius, String shape) 
    {
        if (shape.equalsIgnoreCase("circle")) 
        {
            return Math.PI * radius * radius;
        }
        return 0;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a shape (square, rectangle, circle):");
        String shape = sc.next();

        if (shape.equalsIgnoreCase("square")) {
            System.out.print("Enter the side length: ");
            double side = sc.nextDouble();
            double area = calculateArea(side);
            System.out.println("Area of the square: " + area);
        } else if (shape.equalsIgnoreCase("rectangle")) {
            System.out.print("Enter the length: ");
            double length = sc.nextDouble();
            System.out.print("Enter the width: ");
            double width = sc.nextDouble();
            double area = calculateArea(length, width);
            System.out.println("Area of the rectangle: " + area);
        } else if (shape.equalsIgnoreCase("circle")) {
            System.out.print("Enter the radius: ");
            double radius = sc.nextDouble();
            double area = calculateArea(radius, "circle");
            System.out.println("Area of the circle: " + area);
        } else {
            System.out.println("Invalid shape entered.");
        }
    }
}
