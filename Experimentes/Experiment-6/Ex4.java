/*4.
Find the error in given code, also complete the given code and correct it.

import java.io.File;

class File
{
public static void main(String args[])
{
try
{
File f=new File("D\File\");

}
catch()
{
System.out.println(i);
}
}
}

Expected output:

File Created:false
File name is:File1.txt
File path isD:\RKU\First.java
File read operation:true
File write operationtrue
File length in bytes:0
is File:true
is directory:false
is exists:true */
 

import java.io.File;

public class Ex4 
{
    public static void main(String[] args) 
    {
        try 
        {
            File f = new File("D:\\File1.txt");

            boolean fileCreated = f.createNewFile();
            System.out.println("File Created: " + fileCreated);

            System.out.println("File name is: " + f.getName());

            System.out.println("File path is: " + f.getAbsolutePath());

            boolean canRead = f.canRead();
            System.out.println("File read operation: " + canRead);

            boolean canWrite = f.canWrite();
            System.out.println("File write operation: " + canWrite);

            long fileLength = f.length();
            System.out.println("File length in bytes: " + fileLength);

            boolean isFile = f.isFile();
            System.out.println("Is File: " + isFile);

            boolean isDirectory = f.isDirectory();
            System.out.println("Is directory: " + isDirectory);

            boolean exists = f.exists();
            System.out.println("Is exists: " + exists);

        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
