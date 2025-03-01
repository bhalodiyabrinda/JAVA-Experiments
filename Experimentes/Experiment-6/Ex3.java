/*3.Modify question 2  and perform delete operation using delete().*/

import java.io.File;

public class Ex3 
{
    public static void main(String[] args) 
    {
        File file = new File("second.txt");

        if (file.exists()) 
        {
            String newFileName = "renamed.txt";
            File newFile = new File(newFileName);

            if (file.renameTo(newFile)) 
            {
                System.out.println("File renamed to: " + newFileName);

                if (newFile.delete()) 
                {
                    System.out.println("File deleted successfully.");
                } 
                else 
                {
                    System.out.println("Failed to delete the file.");
                }
            } 
            else 
            {
                System.out.println("Unable to rename the file.");
            }
        } 
        else 
        {
            System.out.println("File does not exist.");
        }
    }
}
