11249A368
Aim:

To write a Java program that checks whether a given year is a leap year or not.

## Algorithm

1. Start.
2. Read a year and set `flag = false`.
3. If the year is divisible by 400, set `flag = true`.
4. Else if it is divisible by 100, set `flag = false`; else if it is divisible by 4, set `flag = true`.
5. If `flag` is true, display "Year is a leap year", otherwise display "Year is not a leap year".
6. Stop.
Program:
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter any year: ");
        int year = s.nextInt();

        boolean flag = false;

        // Check leap year condition
        if (year % 400 == 0) {
            flag = true;
        } else if (year % 100 == 0) {
            flag = false;
        } else if (year % 4 == 0) {
            flag = true;
        } else {
            flag = false;
        }

        // Output result
        if (flag) {
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is not a leap year");
        }

        s.close();
    }
}
Output:
Enter any year: 2024
Year 2024 is a leap year
Result:
Thus, the Java program to check whether a given year is a leap year or not was executed successfully and the output was verified.   
