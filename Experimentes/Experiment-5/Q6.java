/* Q-6
Create user define exception name MyException  and throw that  user define exception using constructor and toString method.
 */

class MyException extends Exception 
{
    public MyException(String message) 
    {
        super(message);
    }
    public String toString() 
    {
        return "Custom Exception: " + getMessage();
    }
}
public class Q6 
{
    public static void main(String[] args) 
    {
        try 
        {
            throw new MyException("This is a custom exception example.");
        } 
        catch (MyException e) 
        {
            System.out.println(e.toString());
        }
    }
}
