11249A368
Aim:
To write a Java program that writes the English capital letters A to Z into a text file using `FileWriter`.

## Algorithm

1. Start.
2. Create a `FileWriter` object for the file "sample2.txt" inside a `try` block.
3. Run a loop from 65 to 90 (ASCII values of A to Z).
4. Write each character into the file using `fw.write(i)`.
5. Close the file using `fw.close()`; if any error occurs, the `catch` block displays the exception.
6. Stop.
    
Program:
import java.io.*;

class FileWriter
{
    public static void main(String[] args)
    {
        try
        {
            java.io.FileWriter fw = new java.io.FileWriter("sample2.txt");

            for(char i = 65; i < 91; i++)
            {
                fw.write(i);
            }

            fw.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception :" + e);
        }
    }
}
Output:
ABCDEFGHIJKLMNOPQRSTUVWXYZ
Result:Thus, the Java program to write the English capital letters A to Z into a text file using FileWriter was executed successfully and the output was verified.
