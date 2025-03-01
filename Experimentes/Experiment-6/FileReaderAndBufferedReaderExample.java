/*6. Implement FileReader and BufferReader class with necessary methods.*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderAndBufferedReaderExample 
{
    public static void main(String[] args) 
    {
        String filePath = "sample.txt";

        try
        {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            int lineNumber = 1;

            while ((line = bufferedReader.readLine()) != null) 
            {
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }

            bufferedReader.close();
            fileReader.close();
        } 
        catch (IOException e) 
        {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
