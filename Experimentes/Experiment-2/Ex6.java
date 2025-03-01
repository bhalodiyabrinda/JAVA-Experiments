/*6. Implement a java program to create a class Person with data members like age, 
name ,address, mobile number. and declare them as private along with a method to 
take input of data member getinput() and for display details show(). Create a 
Person class object and display details.
 */
import java.util.Scanner;

class Person 
{
    private int age;
    private String name;
    private String address;
    private String mobileNumber;

    public void getInput() 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.print("Enter name: ");
        name = sc.next();

        System.out.print("Enter address: ");
        address = sc.next();

        System.out.print("Enter mobile number: ");
        mobileNumber = sc.next();

    }
    public void show() 
    {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Mobile Number: " + mobileNumber);
    }
}

public class Ex6 {
    public static void main(String[] args) 
    {
        Person person = new Person();

        person.getInput();
        System.out.println("Person Details:");
        person.show();
    }
}
