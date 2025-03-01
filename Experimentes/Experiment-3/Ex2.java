/*2.  Create a class Vehicle with run() .Create class Bike that extends Vehicle class and by 
defining run () method demonstrate method overriding.
*/

class Vehicle 
{
    void run() 
    {
        System.out.println("The vehicles");
    }
}

class Bike extends Vehicle 
{
    void run() 
    {
        System.out.println("The bike is running");
    }
}

public class Ex2 
{
    public static void main(String[] args) 
    {
        Vehicle v = new Vehicle();
        Bike b = new Bike();
        
        v.run(); 
        b.run();    
    }
}
