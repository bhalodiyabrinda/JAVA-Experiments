/*2. Implement a java program to create a class Employee display the employee details 
such as employee id, employee name, salary, age using Scanner class. Create 
Employee class to object and display employee details.*/
class Employee 
{
    private int employeeId;
    private String employeeName;
    private double salary;
    private int age;

    Employee(int employeeId, String employeeName, double salary, int age) 
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.age = age;
    }

    public void displayEmployeeDetails() 
    {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: $" + salary);
        System.out.println("Age: " + age);
    }
}

public class Ex2
{
    public static void main(String[] args) 
    {
        Employee s1 = new Employee(01, "aakash", 20000.00,35);
        System.out.println("Employee 1 Details:");
        s1.displayEmployeeDetails();

        
    }
}
