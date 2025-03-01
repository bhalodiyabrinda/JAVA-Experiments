//17.Write a program to find the largest number in an array.

public class EX17 
{
    public static void main(String[] args) 
    {
        int[] numbers = {23, 56, 12};

        int largest = numbers[0];  
        for (int i = 1; i < numbers.length; i++) 
        {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("The largest number in the array is: " + largest);
    }
}
