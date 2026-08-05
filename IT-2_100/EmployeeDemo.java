class Employee {
	int empId;
	String empName;
	double salary;

	void display() {
		System.out.println("Employee Id " + empId);
		System.out.println("Emploee Name " + empName);
		System.out.println("Employee salary " + salary);
	}
}

public class EmployeeDemo {
	public static void main(String[] args){

	 Employee e1 = new Employee();
	 e1.empId = 1601;
	 e1.empName 	="Rakesh";
	 e1.salary = 100000.0;

	 e1.display();
	}
}