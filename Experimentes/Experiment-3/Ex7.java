/*7. Demonstrate usage of this keyword with suitable example.*/

class Student 
{
    private String name;
    private int age;

    public Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
public class Ex7
{    
    public static void main(String[] args) 
    {
        Student s = new Student("AAAA", 20);
        s.displayInfo();
    }
}
