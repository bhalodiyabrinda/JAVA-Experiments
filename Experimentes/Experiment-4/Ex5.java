/*5.Create an interface College with field name Name of college, Branch, Student name, Sem, with method Showdetails(). Add two class Department and Student. In Department it will display Branch along with student name by implementing Showdetails() and Student class will display College name,Student name,sem,Branch by implementing Showdetials(). Showdetials(). Enter all the details by user input only. Display all these details using Reference variable of College interface.
 */

import java.util.Scanner;

interface College 
{
    String collegeName="rku";
    String branch = "";
    String studentName = "";
    int sem = 0;

    void showDetails();
}

class Department implements College 
{
    public void showDetails() {
        System.out.println("Branch: " + branch);
        System.out.println("Student Name: " + studentName);
    }
}

class Student implements College 
{
    private String branch;
    private String studentName;
    private int sem;

    public Student(String branch, String studentName, int sem) 
    {
        this.branch = branch;
        this.studentName = studentName;
        this.sem = sem;

        this.branch = branch;
        this.studentName = studentName;
        this.sem = sem;
    }
    public void showDetails() 
    {
        System.out.println("College Name: " + collegeName);
        System.out.println("Student Name: " + studentName);
        System.out.println("Semester: " + sem);
        System.out.println("Branch: " + branch);
    }
}

public class Ex5 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter College Name: ");
        String collegeName = sc.next();

        System.out.print("Enter Branch: ");
        String branch = sc.next();

        System.out.print("Enter Student Name: ");
        String studentName = sc.next();

        System.out.print("Enter Semester: ");
        int sem = sc.nextInt();

        Student student = new Student(branch, studentName, sem);
        Department department = new Department();

        System.out.println("Student Details:");
        student.showDetails();

        System.out.println("ShjfdhDepartment Details:");
        department.showDetails();
    }
}
 