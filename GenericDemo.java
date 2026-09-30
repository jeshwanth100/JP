class StudentRecord<T> {
    private T studentId;
    private double marks;
    StudentRecord(T studentId, double marks) {
        this.studentId = studentId;
        this.marks = marks;
    }
    void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Marks: " + marks);
    }
}
public class GenericDemo{
    public static void main(String[] args) {
        StudentRecord<Integer> undergraduate =
                new StudentRecord<>(101, 85.5);
        StudentRecord<String> researchScholar =
                new StudentRecord<>("RS2026A100", 95.0);
        undergraduate.display();
        System.out.println();
        researchScholar.display();
    }
}