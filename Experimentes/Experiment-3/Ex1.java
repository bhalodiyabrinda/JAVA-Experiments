/*1. Create a class Animal as a parent class  with method eat() and variable name. Create a 
class Dog which declares one method is display() and inherits all the properties of Animal class. 
Create objects of Dog class and access all the methods, variables of parent class print the details
 of Dog. 
*/

class Animal
{
    String name;

    Animal(String name) 
    {
        this.name = name;
    }

    void eat() 
    {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal 
{
    Dog(String name) 
    {
        super(name);
    }

    void display() 
    {
        System.out.println("Name: " + name);
    }
}

public class Ex1 
{
    public static void main(String[] args) 
    {
        Dog D = new Dog("Bozo");
        
        D.display(); 
        D.eat();      
        
        String dogName = D.name;
        System.out.println("Dog's Name: " + dogName);
    }
}
