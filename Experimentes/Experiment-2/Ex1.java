/*1.Implement a Java program to create a class Student with data ‘name, city and 
age’ along with the method printData to display the data. Create the two objects 
s1, s2 to  declare and access the values.*/

class Student 
{
    private String name;
    private String city;
    private int age;

    Student(String name, String city, int age) 
    {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    void printData() 
    {
        System.out.println("Student Name: " + name);
        System.out.println("Student City: " + city);
        System.out.println("Student Age: " + age);
    }
}
public class Ex1
{                       
    public static void main(String[] args) 
    {
        Student s1 = new Student("John Doe", "New York", 20);
        System.out.println("Student 1 Details:");
        s1.printData();

        Student s2 = new Student("Alice Smith", "Los Angeles", 22);
        System.out.println("\nStudent 2 Details:");
        s2.printData();
    }
}
