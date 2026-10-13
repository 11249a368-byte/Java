11249A368
## Aim

To write a Java program that creates three threads (A, B and C) and sets different priorities for them using the `Thread` class.

## Algorithm

1. Start.
2. Create three classes `A`, `B` and `C` that extend `Thread`, each with a `run()` method that prints its thread name and the numbers 1 to 4.
3. In the `main` method, create objects of the three thread classes.
4. Set the priorities: thread C to maximum, thread B to one more than A's priority, and thread A to minimum.
5. Start the threads A, B and C using the `start()` method.
6. Stop.

Program:
import java.io.*;
class A extends Thread
{
public void run()
{
System.out.println("Thread A started"); for(int i=1;i<=4;i++)
{
System.out.println("from thread A i="+i);
}
System.out.println("exit from A");
}
}
class B extends Thread
{
public void run()
{
System.out.println("Thread B started"); for(int j=1;j<=4;j++)
{
System.out.println("from thread B j="+j);
}
System.out.println("exit from B");
}
}
class C extends Thread
{
public void run()
{
System.out.println("thread C started"); for(int k=1;k<=4;k++)
{
System.out.println("thread c ="+k);
}
System.out.println("exit from c");
}
}
class ThreadPriority
{
public static void main(String[]args)
 {
A threadA = new A();
B threadB = new B();
C threadC = new C(); threadC.setPriority(Thread.MAX_PRIORITY); threadB.setPriority(threadA.getPriority()+1); threadA.setPriority(Thread.MIN_PRIORITY); System.out.println("start thread A"); threadA.start();
System.out.println("start thread B"); threadB.start(); System.out.println("start thread C"); threadC.start();
System.out.println("end of main thread");
}
}

Output:

Thread output varies from run to run. A typical output of ThreadPriority.java:

start thread A
start thread B
start thread C
end of main thread
thread C started
thread c =1
thread c =2
thread c =3
thread c =4
exit from c
Thread B started
from thread B j=1
from thread B j=2
from thread B j=3
from thread B j=4
exit from B
Thread A started
from thread A i=1
from thread A i=2
from thread A i=3
from thread A i=4
exit from A
Result:
Thus, the Java program to create three threads and set different priorities for them was executed successfully and the output was verified.
