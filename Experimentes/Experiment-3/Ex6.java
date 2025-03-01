/*6. Design a class Circle with data member radius and declare variable pie as  final variable 
and find area of circle.
 */
class Circle 
{
    double radius;

    double PI = 3.14159265359;

    Circle(double radius) 
    {
        this.radius = radius;
    }

    double calculateArea() {
        return PI * radius * radius;
    }
}
public class Ex6{
    public static void main(String[] args) 
    {
        Circle c = new Circle(5.0);

        double area = c.calculateArea();
        System.out.println("Radius: " + c.radius);
        System.out.println("Area of the circle: " + area);
    }
}
