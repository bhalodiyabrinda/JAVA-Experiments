/*8. Design class Shape in which draw() declare as final. Extends Shape class along with sub class
 Rectangle which have draw(). Try to override draw() and take a screen shot of output or error.
*/

class Shape 
{
    void draw() 
    {
        System.out.println("Drawing a shape");
    }
}

class Rectangle extends Shape 
{
    void draw() 
    {
        System.out.println("Drawing a rectangle");
    }
}

public class Ex8 {
    public static void main(String[] args) 
    {
        Shape s = new Shape();
        s.draw(); 

        Rectangle r = new Rectangle();
        r.draw(); 
    }
}
