import java.util.*;
class Employee {
    String name;
    String department;
    double salary;
    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Anvesh", "IT", 65000),
            new Employee("Rahul", "HR", 48000),
            new Employee("Priya", "Finance", 72000),
            new Employee("Kiran", "IT", 45000),
            new Employee("Sneha", "Marketing", 58000)
        );
        System.out.println("Employees earning more than ₹50,000:");
        employees.stream()
                .filter(e -> e.salary > 50000)
                .forEach(e -> e.display());
    }
}
