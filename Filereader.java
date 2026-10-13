11249A368
## Aim

To write a Java program that reads the contents of a text file character by character using `FileReader` and displays them on the screen.

## Algorithm

1. Start.
2. Create a `FileReader` object for the file "sample2.txt" inside a `try` block.
3. Read one character at a time using `fr.read()` and store it in `i`.
4. Repeat while `i` is not -1 (-1 means end of file), displaying each character using `(char)i`.
5. Close the file using `fr.close()`; if any error occurs, the `catch` block displays the exception.
6. Stop.
  
Program:
import java.io.*; class Filereader
{
public static void main(String[]args)
{
try
{
FileReader fr=new FileReader("sample2.txt"); int i;
while((i=fr.read())!=-1)
{
System.out.println((char)i);
}
fr.close();
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}
Output:
A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S
T
U
V
W
X
Y
Z

Result

Thus, the Java program to read the contents of a text file character by character using FileReader was executed successfully and the output was verified.
