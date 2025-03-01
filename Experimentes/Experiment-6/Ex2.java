/*2.Create file "second.txt" using File class  and Change file name using renameTo. */

import java.io.File;

public class Ex2 
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
