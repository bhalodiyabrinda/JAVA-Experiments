/*2.
Create array of numbers with size= 5.
try to access element of index 10 and find is there any exception occurs?
Write code to handle exception */

public class Q2 {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // Create an array of size 5
        
        try {
            int element = numbers[10]; // Attempt to access an element at index 10
            System.out.println("Element at index 10: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
    }
}
