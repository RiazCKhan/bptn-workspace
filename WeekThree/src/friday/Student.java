package friday;

public class Student {

	private String userName = "";
	private String password = "";
	private int studentID;
//	This creates an Array of Students named 'allStudents'
	Student[] allStudents = new Student[10];

//	Add Student Method
	public void addStudent(Student student) {
		int index = -1;
		int i = 0;

		while (i < allStudents.length) {
			if (allStudents[i].studentID == 0) {
				index = -1;
				break;
			}
			if (index != -1) {
				allStudents[index] = student;
			} else {
				new RuntimeException("School Full");
			}
			i++;
		}
	}

//	Search Student Method
	public Student searchStudent(int studentId) {
		for (int i = 0; i < allStudents.length; i++) {
			if (allStudents[i].studentID == studentID) {
				return allStudents[i];
			}
		}
		return null;
	}

	public static void main(String[] args) {

	}

}
