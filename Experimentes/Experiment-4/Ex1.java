/*1.Create an interface named Shape that contains empty methods named Area () and perimeter(). Provide
 two classes named Triangle and Circle such that each one of the classes implement Shape. Each one of 
 the classes contains only the method Area () and perimeter().that prints the area and perimeter() of
  the given shape. */

interface Shape 
{
    void Area();
    void perimeter();
}
class Triangle implements Shape 
{
    int height=12;
    int bace =12;

    public void Area() 
    {
        System.out.println("Area of Triangle:"+(0.5*height*bace));
    }

    public void perimeter() 
    {
        System.out.println("perimeter of Triangle: cm squar");
    }
}
class Circle implements Shape 
{
    int r=12;

    public void Area() 
    {
        System.out.println("Area of Triangle:"+(3.14*r*r));
    }

    public void perimeter() 
    {
        System.out.println("perimeter of Triangle: cm squar");
    }
}
public class Ex1 {
    public static void main(String[] args) 
    {
        Triangle t = new Triangle();
        t.Area();
        t.perimeter();
        
        Circle c = new Circle();
        c.Area();
        c.perimeter();
    }
}
