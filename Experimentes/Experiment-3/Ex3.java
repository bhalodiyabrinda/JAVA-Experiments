/*
3. Creates classes Car, Maruti and Maruti800. We have done a setup – class Maruti extends Car and class
 Maruti800 extends Maruti. With the help of this Multilevel hierarchy setup our Maruti800 class is able
  to use the methods of both the classes (Car and Maruti). In Car have method name Speed() along with
   data member fuel. Also Maruti have gear() along with geartype data member and Maruti800 have 
   getModel() along  with data member gear type. Display all details using Maruti800 class.
*/

class Car 
{
    String fuel;

    Car(String fuel) 
    {
        this.fuel = fuel;
    }

    void speed() {
        System.out.println("Car speed method");
    }
}

class Maruti extends Car 
{
    String geartype;

    Maruti(String fuel, String geartype) 
    {
        super(fuel);
        this.geartype = geartype;
    }

    void gear() 
    {
        System.out.println("Maruti gear method");
    }
}

class Maruti800 extends Maruti 
{
    String model;

    Maruti800(String fuel, String geartype, String model) 
    {
        super(fuel, geartype);
        this.model = model;
    }

    void getModel() 
    {
        System.out.println("Model: " + model);
        System.out.println("Fuel: " + fuel);
        System.out.println("Gear Type: " + geartype);
    }
}

public class Ex3 
{
    public static void main(String[] args) 
    {
        Maruti800 m = new Maruti800("Petrol", "Manual", "Maruti 800");

        m.getModel(); 
        m.speed();    
        m.gear();     
    }
}

