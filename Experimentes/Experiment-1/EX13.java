//13.Write a Program to Display all the multiples of 3 within the range of 10 to 50.

public class EX13 {
    public static void main(String[] args) 
    {
        System.out.println("Multiples of 3 within the range of 10 to 50:");

        for (int i = 10; i <= 50; i++) 
        {
            if (i % 3 == 0) 
            {
                System.out.println(i);
            }
        }
    }
}