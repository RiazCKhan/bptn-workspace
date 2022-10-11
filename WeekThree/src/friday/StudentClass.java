package friday;

public class StudentClass {

	private String userName = "";
	private String password = "";
	private String firstName = "";
	private String lastName = "";
	private String email = "";
	private String phoneNumber = "";
	private String address = "";
	private String gender = "";
	private String dateOfBirth = "";
	public static int studentId;
	private int year;
	private int curriculumId;
	private static int[] allStudents = new int[10];

//	Add Student
	public StudentClass(String userName, String password, String firstName, String lastName, String email,
			String phoneNumber, String address, String gender, String dateOfBirth, int year, int curriculumId) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		studentId++;
		this.year = year;
		this.curriculumId = curriculumId;

//		Create Array of all StudentId
		for (int index = 0; index < allStudents.length; index++) {
			if (allStudents[index] == 0) {
				allStudents[index] = studentId;
				break;
			}
		}
	}

//	Get a Student
	public String getStudent() {
		String student = "userName = " + userName + ", password = " + password + "\n" + "firstName = " + firstName
				+ ", lastName = " + lastName + "\n" + "email = " + email + ", phoneNumber = " + phoneNumber + "\n"
				+ "address = " + address + "\n" + "gender = " + gender + ", dateOfBirth = " + dateOfBirth + "\n"
				+ "year = " + year + ", curriculumId = " + curriculumId + ", studentId = " + studentId;
		return student;
	}

// Update a Student
	public void setStudent(String userName, String password, String firstName, String lastName, String email,
			String phoneNumber, String address, String gender, String dateOfBirth) {
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}

//	Update Student Credentials
	public void updateCredetials(String userName, String password, String email) {
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

//	Update Contact Information
	public void updateContactInformation(String email, String phoneNumber) {
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

//	Update Student Address
	public void updateStudentAddress(String address) {
		this.address = address;
	}

//	Return Student By ID
	public String getStudentById(int id) {
		return firstName + " " + lastName;
	}

//	Search Student By ID
	public void findStudent(int studentId) {
		for (int student : allStudents) {
			if (student == studentId) {
				System.out.println(
						"Student Found: " + "\n" + getStudentById(student) + "\n" + "Student ID: " + studentId);
//				break;
			} else {
				System.out.println("No Student Found" + "\n");
//				break;
			}
		}
	}

//	Reset Student String Fields
	public void resetStringFieldsByStudentId(int id) {
		this.userName = "";
		this.password = "";
		this.firstName = "";
		this.lastName = "";
		this.email = "";
		this.phoneNumber = "";
		this.address = "";
		this.gender = "";
		this.dateOfBirth = "";
	}

//	Reset Student Integer Fields
	public void resetIntFieldsByStudentId(int id) {
		this.year = 0;
		this.curriculumId = 0;
	}

//	Delete Student
	public void deleteStudent(int studentId) {
		for (int studentIndex = 0; studentIndex < allStudents.length; studentIndex++) {
			if (allStudents[studentIndex] == studentId) {
				resetStringFieldsByStudentId(allStudents[studentIndex]);
				resetIntFieldsByStudentId(allStudents[studentIndex]);
				allStudents[studentIndex] = 0;
				break;
			} else {
				System.out.println("No Student Found" + "\n");
//				break;
			}
		}

	}

	public static void main(String[] args) {
		
//		Adding (Create) 5 Students
		StudentClass student1 = new StudentClass("JimBean", "123456", "Jim", "Bean", "JB@mail.com", "(416) 111-1111",
				"9-1 Crescent Rd", "Male", "April 1, 1990", 2000, 10);

		StudentClass student2 = new StudentClass("SamLoon", "123456", "Sam", "Loon", "SL@mail.com", "(416) 111-1111",
				"10-2 Circle Rd", "Male", "April 1, 1990", 2000, 10);

		StudentClass student3 = new StudentClass("Bugs", "123456", "Bugs", "Bunny", "BB@mail.com", "(416) 111-1111",
				"10-2 Warner Rd", "Male", "April 1, 1990", 2000, 10);

		StudentClass student4 = new StudentClass("LouisL", "123456", "Louis", "Lane", "LL@mail.com", "(416) 111-1111",
				"22-9 Warner Rd", "Female", "April 1, 1990", 2000, 10);

		StudentClass student5 = new StudentClass("KirssK", "123456", "Kirss", "Mac", "KM@mail.com", "(416) 111-1111",
				"100 Dime Rd", "Female", "April 1, 1990", 2000, 10);
		
//		Get Student (Read)
		System.out.println("---READ STUDENT---");
		System.out.println(student1.getStudent());
		
//		Update Read Student
		student1.setStudent("JamesBond", "123456", "James", "Bond", "JamesB@mail.com", "(416) 911-1111", "Secret Dr.", "Male", "March 9, 1999");
		System.out.println("");		
		System.out.println("---UPDATE STUDENT; ALL FIELDS--");		
		System.out.println(student1.getStudent()); 
		
//		Update Read Student Credentials
		student1.updateCredetials("Secret Agent", "007", "007@mail.com");
		System.out.println("");		
		System.out.println("---UPDATE CREDENTIALS--");		
		System.out.println(student1.getStudent());
		
//		Update Read Contact Information
		student1.updateContactInformation("barcode@mail.com", "911");
		System.out.println("");		
		System.out.println("---UPDATE CONTACT INFORMATION--");		
		System.out.println(student1.getStudent());
		
//		Update Read Student Address
		student1.updateStudentAddress("Super Super Secret Dr Cres");
		System.out.println("");		
		System.out.println("---UPDATE ADDRESS--");		
		System.out.println(student1.getStudent());
		
//		Search/Find (Read) Student
		System.out.println("");		
		System.out.println("---SEARCH / FIND STUDENT---");		
		student1.findStudent(1);
		System.out.println("");	
		student2.findStudent(2); 
//		student3.findStudent(3);
//		student4.findStudent(4);
//		student5.findStudent(5);
		
//		Delete Student
		System.out.println("");
		System.out.println("Delete Student...");
		student1.deleteStudent(1);
		System.out.println("");
		System.out.println("Search for Deleted Student...");
		System.out.println("");
		student1.findStudent(1);
		System.out.println("");
		System.out.println("Attempt to Retrieve Delete Student Details...");		
		student1.getStudent();
		System.out.println("No Student...");
				
	}

}
