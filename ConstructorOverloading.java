class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    Student(String n) {
        name = n;
        age = 0;
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }   

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alice");
        Student s3 = new Student("Bob", 20);

        s1.display();
        System.out.println();
        s2.display();
        System.out.println();
        s3.display();
    }
}