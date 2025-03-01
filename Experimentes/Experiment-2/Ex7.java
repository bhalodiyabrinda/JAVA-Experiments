/*Consider 2 program problem in which add condition for which employee get highest
 salary and display that salary with necessary employee details.
 */

import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) 
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nSalary: " + salary;
    }
}

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = sc.nextInt();
        sc.nextLine(); 

        Employee highestPaidEmployee = null;
        double highestSalary = Double.MIN_VALUE;

        for (int i = 1; i <= numEmployees; i++) {
            System.out.println("Enter details for Employee " + i);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); 

            Employee employee = new Employee(name, age, salary);

            if (salary > highestSalary) {
                highestSalary = salary;
                highestPaidEmployee = employee;
            }
        }

        if (highestPaidEmployee != null) {
            System.out.println("\nEmployee with the highest salary:");
            System.out.println(highestPaidEmployee);
        } else {
            System.out.println("\nNo employee details provided.");
        }

    }
}
