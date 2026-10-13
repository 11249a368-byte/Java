 Aim:To write a Java program that checks whether a given number is an Armstrong number (a number equal to the sum of the cubes of its digits).
 Algorithm
1. Start
2. Read a positive number `n` and copy it to `nu`.
3. Repeat while `nu` is not 0: take the last digit (`nu % 10`), add its cube to `num`, then remove the last digit (`nu / 10`).
4. Compare `num` with the original number `n`.
5. If they are equal, display "Armstrong Number", otherwise display "Not an Armstrong Number".
6. Stop.

Program:
  
  import java.util.Scanner; public class Armstrong
{
public static void main(String args[])
{
int n, nu, num=0, rem;
Scanner scan = new Scanner(System.in);

System.out.print("Enter any Positive Number : "); n = scan.nextInt();
nu = n; while(nu != 0)
{
rem = nu%10;
num = num + rem*rem*rem; nu = nu/10;
}
if(num == n)
{
System.out.print("Armstrong Number");
}
else
{
System.out.print("Not an Armstrong Number");
}
}
}

