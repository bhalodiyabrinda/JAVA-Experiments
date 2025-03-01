/*1.Create file "first.txt" using File class. Implement following methods.

(i)createNewFile (ii)getName (iii)getAbsolutePath (iv)canRead (v)canWrite (vi)canRead 
(vii)length (viii)canFile (ix)canDirectory (x)exists */

import java.io.File;
import java.io.IOException;

public class Ex1 
{
    public static void main(String[] args) 
    {
        File file = new File("first.txt");

        try 
        {
            if (file.createNewFile()) 
            {
                System.out.println("File created: " + file.getName());
            } 
            else 
            {
                System.out.println("File already exists.");
            }
        } catch (IOException e) 
        {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        System.out.println("File Name: " + file.getName());

        System.out.println("Absolute Path: " + file.getAbsolutePath());

        System.out.println("Can Read: " + file.canRead());

        System.out.println("Can Write: " + file.canWrite());

        System.out.println("Can Execute: " + file.canExecute());

        System.out.println("File Length: " + file.length() + " bytes");

        System.out.println("Is a File: " + file.isFile());

        System.out.println("Is a Directory: " + file.isDirectory());

        System.out.println("File Exists: " + file.exists());
    }
}
