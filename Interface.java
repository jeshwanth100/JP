interface Animal {

    // Abstract method
    void sound();

    // Normal/default method
    default void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog implements Animal {

    // Implementing interface method
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Interface {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}
