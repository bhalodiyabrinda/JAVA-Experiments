/* 23. Write a program to Calculate the Body mass Index (BMI).

The user enters his height (in inches) and weight (in pounds). The variables passed by the user are assigned to the float type. After calculating the BMI value, the value will be assigned to the appropriate range and the correct message will appear on the console. You can use the if-else-if ladder for printing the message on the console. (HINT FOR CALCULATION: bmi = (float)(weight / Math.pow(height, 2) * 703)*/

import java.util.Scanner;

public class EX23 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        float weight;
        System.out.print("Enter your weight (in pounds): ");
        weight = scanner.nextFloat();

        float height;
        System.out.print("Enter your height (in inches): ");
        height = scanner.nextFloat();

        float bmi = (float) (weight / Math.pow(height, 2) * 703);

        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You are in a healthy weight range.");
        } else if (bmi >= 24.9 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}
