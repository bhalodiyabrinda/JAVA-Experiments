/*5. Implement FileWrite class with try and catch block.*/

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite 
{
    public static void main(String[] args) 
    {
        String filePath = "output.txt";

        try 
        {
            FileWriter fileWriter = new FileWriter(filePath);

            fileWriter.write("This is some text written to the file.");
            fileWriter.write("\nYou can add more lines as needed.");

            fileWriter.close();

            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) 
        {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
