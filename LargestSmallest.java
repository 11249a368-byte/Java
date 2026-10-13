11249A368
Aim

To write a Java program that finds the sum, largest number and smallest number in an array.

## Algorithm

1. Start.
2. Create an array `a` with 10 numbers and set `sum = 0`, `min = a[0]` and `max = a[0]`.
3. Run a loop from the first element to the last element of the array.
4. In each step, update `max` if the element is greater, update `min` if the element is smaller, and add the element to `sum`.
5. After the loop ends, display the sum, the largest number and the smallest number.
6. Stop.
    
Program:
import java.util.Scanner;
public class LargestSmallest
{
    public static void main(String args[])
    {
        int a[] = {23, 34, 13, 64, 72, 90, 10, 15, 9, 27};

        int sum = 0;
        int min = a[0];
        int max = a[0];

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }

            if (a[i] < min)
            {
                min = a[i];
            }

            sum = sum + a[i];
        }

        System.out.println("The sum is: " + sum);
        System.out.println("Largest number in the array is: " + max);
        System.out.println("Smallest number in the array is: " + min);
    }
}
Output:
The sum is: 357
Largest number in the array is: 90
Smallest number in the array is: 9
Result:
Thus, the Java program to find the sum, largest number and smallest number in an array was executed successfully and the output was verified.
