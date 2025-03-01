//20.Write a program to check whether a given year is a leap year or not.

import java.util.*;

public class EX20
{
    public static void main(String args [])
    {
        Scanner scanner = new Scanner(System.in);

        int year;
        System.out.println("Enter the any year:");
        year = scanner.nextInt();

        if(year % 4 == 0)
        {
            System.out.println(year + "is Leap year");
        }
        else
        {
            System.out.println(year + "is not Leap year");
        }

    }
}