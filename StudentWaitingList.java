import java.util.*;

class StudentWaitingList {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        LinkedList<String> waitingList = new LinkedList<>();

        // Add students
        students.add("Rahul");
        students.add("Priya");
        students.add("Arun");

        waitingList.add("Rahul");
        waitingList.add("Priya");
        waitingList.add("Arun");

        // Display students
        System.out.println("ArrayList: " + students);
        System.out.println("LinkedList: " + waitingList);

        // Remove a student
        students.remove("Priya");
        waitingList.remove("Priya");

        // Display after removal
        System.out.println("After removing Priya:");
        System.out.println("ArrayList: " + students);
        System.out.println("LinkedList: " + waitingList);
    }
}