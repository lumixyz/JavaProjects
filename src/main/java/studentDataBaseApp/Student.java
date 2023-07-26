package studentDataBaseApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private String gradeYear;
	private int studentID;
	private String courses;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1001;
	
	//Constructor prompt to enter student name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 Freshman\n2 Sophomore\n3 Junior\n4 Senior\nEnter student grade level: ");
		this.gradeYear = in.nextLine();
		
		System.out.println(firstName + " " + lastName + " "+ gradeYear);
		
		
	}
	
	//Generate a 5 digit unique ID with the first number being their grade 
	/*private String setStudentID() {
		String[] stuID = new String[5];
		stuID[0] = this.gradeYear; 
		int i = 1;
		while(i<=5) {
			
		}
	}*/
	
	//Enrol in courses 
	
	
	//View balance and pay tuition
	
	
	//Show status of student

}
