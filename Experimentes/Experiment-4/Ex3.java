/*3.Declare a class Vehicle. The Vehicle class derive two_wheeler, three_wheeler and four_wheeler class. Display properties of each type of vehicle using member function of the class. (like speed,fuel type,etc.) */

class Vehicle 
{
    private String type;
    private int speed;
    private String fuelType;

    public Vehicle(String type, int speed, String fuelType) 
    {
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public void displayProperties() 
    {
        System.out.println("Type: " + type);
        System.out.println("Speed: " + speed );
        System.out.println("Fuel Type: " + fuelType);
    }
}

class TwoWheeler extends Vehicle 
{
    public TwoWheeler(String type, int speed, String fuelType) 
    {
        super(type, speed, fuelType);
    }
}

class ThreeWheeler extends Vehicle 
{
    public ThreeWheeler(String type, int speed, String fuelType) 
    {
        super(type, speed, fuelType);
    }
}

class FourWheeler extends Vehicle 
{
    public FourWheeler(String type, int speed, String fuelType) 
    {
        super(type, speed, fuelType);
    }
}

public class Ex3
{
    public static void main(String[] args) 
    {
        TwoWheeler bike = new TwoWheeler("Two Wheeler", 80, "Petrol");
        bike.displayProperties();

        ThreeWheeler auto = new ThreeWheeler("Three Wheeler", 60, "CNG");
        auto.displayProperties();

        FourWheeler car = new FourWheeler("Four Wheeler", 120, "Diesel");
        car.displayProperties();
    }
}
