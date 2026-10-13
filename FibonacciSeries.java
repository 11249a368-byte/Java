## Aim

To write a Java program that prints the Fibonacci series up to n terms using a method.

## Algorithm

1. Start.
2. Read the value of `n` and call the `fibonacci(n)` method.
3. If `n` is 0, display "0"; if `n` is 1, display "0 1".
4. Otherwise, print the first two terms "0 1" and set `a = 0`, `b = 1`.
5. Repeat in a loop: find `nextNumber = a + b`, print it, then update `a = b` and `b = nextNumber`.
6. Stop when the loop ends.
  
Program:
import java.util.Scanner; public class FibonacciSeries {
public static void main(String[] args) { Scanner s = new Scanner(System.in); System.out.print("Enter the value of n: "); int n = s.nextInt();
fibonacci(n);
}
public static void fibonacci(int n) { if (n == 0) {
System.out.println("0");
} else if (n == 1) { System.out.println("0 1");
} else {
System.out.print("0 1 "); int a = 0;
int b = 1;
for (int i = 1; i < n; i++) { int nextNumber = a + b;
System.out.print(nextNumber + " ");
a = b;
b = nextNumber;
}
}
}
}
