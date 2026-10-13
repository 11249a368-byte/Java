## Aim

To write a Java program that demonstrates an interface by creating an `Animal` interface and implementing it in a `Dog` class.

## Algorithm

1. Start.
2. Create an interface `Animal` with an abstract method `sound()`.
3. Create a class `Dog` that implements `Animal` and defines the `sound()` method to display "Dog Barks".
4. In the `main` method, create an object `d` of the `Dog` class.
5. Call the `sound()` method using `d.sound()`.
6. Stop.
    
Program:
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog Barks");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
