/*Q-3

Find type of exception occurs in given code.

Rewrite code that handle Exception using nested- try , catch and finally block.

public class nestedtry
{
public static void main(String args[])
{

    int b=30/0;
    System.out.println("going to divide by 0");
    int a[]=new int[5];
    a[5]=10;
    System.out.println(a[5]);
}
}
*/

public class nestedtry
{
    public static void main(String args[])
    {

        int b = 30/0;
        System.out.println("going to divide by 0");

        try
        {
            int a[] = new int[5];
            a[5] = 10;
            System.out.println(a[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("An ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        } 
        finally 
        {
            System.out.println("Inner finally block executed");
        }
    }
}