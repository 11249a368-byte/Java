11249A368
Aim:

To write a Java program that reads the names and marks of 6 students and displays the students who scored more than 60.

## Algorithm

1. Start.
2. Create two arrays, `name` and `marks`, each of size 6.
3. Run a loop 6 times to read each student's name and marks.
4. Run another loop from the first student to the last.
5. If a student's marks are greater than 60, display that student's name and marks.
6. Stop.

Program:
import java.util.Scanner;

public class MarksAbvSixty
{
    public static void main(String args[])
    {
        int marks[] = new int[6];
        String name[] = new String[6];
        int i;

        Scanner scanner = new Scanner(System.in);

        // Input
        for(i = 0; i < 6; i++)
        {
            System.out.print("Enter Name of Student and Marks of Subject " + (i + 1) + ": ");
            name[i] = scanner.next();
            marks[i] = scanner.nextInt();
        }

        // Output (marks > 60)
        System.out.println("\nStudents scoring more than 60:");

        for(i = 0; i < 6; i++)
        {
            if(marks[i] > 60)
            {
                System.out.println(name[i] + " : " + marks[i]);
            }
        }
    }
}

Output:
Enter Name of Student and Marks of Subject 1: Arun 75
Enter Name of Student and Marks of Subject 2: Bala 58
Enter Name of Student and Marks of Subject 3: Charan 82
Enter Name of Student and Marks of Subject 4: Divya 45
Enter Name of Student and Marks of Subject 5: Esha 91
Enter Name of Student and Marks of Subject 6: Farid 60

Students scoring more than 60:
Arun : 75
Charan : 82
Esha : 91

Result:
Thus, the Java program to read the names and marks of 6 students and display those who scored more than 60 was executed successfully and the output was verified.    
