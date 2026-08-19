interface Animal {
    public void eat();
    }

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {    
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}