## Aim

To write a Java program that finds the largest of three numbers using `if-else` statements.

## Algorithm

1. Start.
2. Read three numbers `x`, `y` and `z`.
3. If `x` is greater than both `y` and `z`, display "First number is largest".
4. Else if `y` is greater than both `x` and `z`, display "Second number is largest".
5. Else if `z` is greater than both `x` and `y`, display "Third number is largest"; otherwise display "The numbers are not distinct or equal".
6. Stop.
    
Program:
import java.util.Scanner;

class LargestOfThreeNumbers {
    public static void main(String args[]) {

        int x, y, z;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three integers:");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if (x > y && x > z) {
            System.out.println("First number is largest");
        } 
        else if (y > x && y > z) {
            System.out.println("Second number is largest");
        } 
        else if (z > x && z > y) {
            System.out.println("Third number is largest");
        } 
        else {
            System.out.println("The numbers are not distinct or equal");
        }
    }
}
