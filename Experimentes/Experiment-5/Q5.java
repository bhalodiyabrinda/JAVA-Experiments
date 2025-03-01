/* Q-5 

Demonstrate the usage of finally block.

 */
public class Q5
{
	public static void main (String s1[])
	{
		try
		{	
			String s= null;
			System.out.println("len"+s.length());
		}
		catch(NullPointerException e)
		{	
			System.out.println(e);
		}
		finally
		{
			System.out.println("Always finally bolck executed");

		}
	}
}