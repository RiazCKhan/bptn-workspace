package wednesday;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 1. Create a Student Class
public class Student {

// 2. Assign studentId, studentName, course
	private int studentId;
	private String studentName;
	private String course;

// 3. Implement student parameterized constructor. 
	public Student(int studentId, String studentName, String course) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
	}

// 4. Override toString() method for Student class. 
	@Override
	public String toString() {
		return "Student Details:\n" + "studentId:" + studentId + "\nstudentName:" + studentName + "\ncourse:" + course;
	}

	// Complete the missing code in main function in Main class below

	public class Main {

		public static void main(String[] args) {

			List<Student> studentList = new ArrayList<>();

			studentList.add(new Student(1, "Alex", "Java with DS"));
			studentList.add(new Student(2, "Albert", "Java with DS"));
			studentList.add(new Student(3, "Samson", "Spring Api"));
			studentList.add(new Student(1, "Billy", "DBMS"));

			Iterator<Student> itr = studentList.iterator();

			while (itr.hasNext()) {
				System.out.println(itr.next());

			}

			// Iterate through the ArrayList using Iterator and print out its elements

		}

	}

}
