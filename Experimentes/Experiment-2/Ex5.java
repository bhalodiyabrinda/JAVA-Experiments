/*5. Implement a java program to create a class Box with necessary members  for
 calculating volume of Box and display it with method name Volume. Create a Box 
 class object and to display the volume of Box.*/

import java.util.Scanner;

class Box {
    double length;
    double width;
    double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double calculateVolume() {
        return length * width * height;
    }
}

public class Ex5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the box: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of the box: ");
        double width = sc.nextDouble();

        System.out.print("Enter the height of the box: ");
        double height = sc.nextDouble();

        Box myBox = new Box(length, width, height);

        double volume = myBox.calculateVolume();
        System.out.println("The volume of the box is: " + volume);
    }
}
