## Aim

To write a Java program that checks whether a given number is even or odd using a `switch` statement.

## Algorithm

1. Start.
2. Read a number `n`.
3. Find the remainder of `n` divided by 2 (`n % 2`).
4. Using `switch`, if the remainder is 0, display "This number is even".
5. If the remainder is 1, display "This number is odd".
6. Stop.
Program:
import java.util.Scanner;

class EvenOddSwitch {
    public static void main(String args[]) {

        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = s.nextInt();

        switch (n % 2) {

            case 0:
                System.out.println("This number is even");
                break;

            case 1:
                System.out.println("This number is odd");
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
