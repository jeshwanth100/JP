class Student{
	int studentId;
	String studentName;

	void display(){
 		System.out.println("Student ID : " + studentId);
		System.out.println("Student Name : " + studentName);
	}
}

public class StudentDemo {
	public static void main(String[] args) {
	 
	 Student s1 = new Student();
	 s1.studentId = 100;
	 s1.studentName = "Jeshwanth";

	s1.display();
	}
}