/*5.Create a class Student with static method getName() ,SetName(), ShowDetails()  and with some 
data member like name,Rollno,Branch,sem,college. Using getName() take input from user and using 
SetName() change details of mention data member. Finally display updated values of Student.
*/

import java.util.Scanner;

class Student 
{
    static String name;
    static int rollNo;
    static String branch;
    static int semester;
    static String college;

    public static void getName() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        name = sc.next();
    }

    public static void setName(int rollNo, String branch, int semester, String college) {
        Student.rollNo = rollNo;
        Student.branch = branch;
        Student.semester = semester;
        Student.college = college;
    }

    public static void showDetails() 
    {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
        System.out.println("Semester: " + semester);
        System.out.println("College: " + college);
    }
}

public class Ex5 {
    public static void main(String args[])
    {
        Student.getName(); 

        Student.setName(101, "CE", 3, "RKU College");

        Student.showDetails();
    }
}
