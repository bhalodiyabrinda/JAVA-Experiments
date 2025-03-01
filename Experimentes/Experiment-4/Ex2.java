/*2.Create an abstract class Insect that contains abstract method void flystatus(). Provide three classes Temite, Grasshopper and Ant such that each one classes implement flystatus().

Expected Output:
Termite cannot fly
Grasshopper can fly
Ant cannot fly
*/

abstract class Insect 
{
    public abstract void flystatus();
}

class Termite extends Insect 
{
    public void flystatus() 
    {
        System.out.println("Termite cannot fly");
    }
}

class Grasshopper extends Insect 
{
    public void flystatus() 
    {
        System.out.println("Grasshopper can fly");
    }
}

class Ant extends Insect 
{
    public void flystatus() 
    {
        System.out.println("Ant cannot fly");
    }
}

public class Ex2 
{
    public static void main(String[] args) 
    {
        Insect termite = new Termite();
        termite.flystatus();

        Insect grasshopper = new Grasshopper();
        grasshopper.flystatus();

        Insect ant = new Ant();
        ant.flystatus();
    }
}
