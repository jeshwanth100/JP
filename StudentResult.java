
import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    int rollNo;
    int marks;

    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name
                + ", Roll No: " + rollNo
                + ", Marks: " + marks);
    }
}

public class StudentResult {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Rahul", 101, 85));
        students.add(new Student("Priya", 102, 72));
        students.add(new Student("Arjun", 103, 90));
        students.add(new Student("Sneha", 104, 68));
        students.add(new Student("Kiran", 105, 78));

        System.out.println("Students scoring 75 or above:");

        students.stream()
                .filter(s -> s.marks >= 75)
                .forEach(s -> s.display());
    }
}
