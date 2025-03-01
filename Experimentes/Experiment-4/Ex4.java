/*4.Create an interface Vegetable along with method color() and grow(). Implement color and grow methods with three classes Spinach, Potato, Onion, Tomato.

Expected Output:

Color of spinach is green
Spinach grows above ground
Color of Potato is browny white
Potato grows under ground
Color of Onion is red
Onion grows under ground
Color of Tomato is red
Tomato grows above ground

 */

interface Vegetable 
{
    void color();
    void grow();
}

class Spinach implements Vegetable 
{
    public void color() 
    {
        System.out.println("Color of Spinach is green");
    }
    public void grow() 
    {
        System.out.println("Spinach grows above ground");
    }
}

class Potato implements Vegetable 
{
    public void color() 
    {
        System.out.println("Color of Potato is browny white");
    }
    public void grow() 
    {
        System.out.println("Potato grows under the ground");
    }
}

class Onion implements Vegetable 
{
    public void color() 
    {
        System.out.println("Color of Onion is red");
    }
    public void grow() 
    {
        System.out.println("Onion grows under the ground");
    }
}

class Tomato implements Vegetable 
{
    public void color() 
    {
        System.out.println("Color of Tomato is red");
    }
    public void grow() 
    {
        System.out.println("Tomato grows above ground");
    }
}

public class Ex4 
{
    public static void main(String[] args) 
    {
        Vegetable spinach = new Spinach();
        spinach.color();
        spinach.grow();

        Vegetable potato = new Potato();
        potato.color();
        potato.grow();

        Vegetable onion = new Onion();
        onion.color();
        onion.grow();

        Vegetable tomato = new Tomato();
        tomato.color();
        tomato.grow();
    }
}
