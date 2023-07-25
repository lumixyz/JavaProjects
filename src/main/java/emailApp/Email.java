package emailApp;

import java.util.Scanner;

public class Email { //This will house the objects.
	
	//Variables set-up
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "lumispencer.com";
	
	
	//constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		//Call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		//Combine elements to generate email address
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is: " + email);
	}
	
	//ask for the department
	private String setDepartment() {
		System.out.println("NEW WORKER: "+ firstName + ". DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int deptChoice= in.nextInt();
		String dept = "";
		
		switch(deptChoice) {
			case 1:
				dept = "sales"; 
				break;
			case 2: 
				dept = "dev"; 
				break;
			case 3: 
				dept = "acct"; 
				break;
			default: 
				dept = ""; 
				break;
		}
		return dept;	
	}
	
	//generate a random password
	private String randomPassword(int length) {
		//possibilities to choose from
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);	
		}
		return new String(password);
	}
	
	//set the mailbox capacity
	public void setMailboxCapacity(int capacity) { // mailbox capacity can be changed by calling this method on the object e.g. 	em1.setMailboxCapacity()
		this.mailboxCapacity = capacity;
	}
	
	//set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	
	//Show the mailbox capacity
	public int getMailboxCapacity() {return mailboxCapacity;}
	
	//Get alternate email
	public String getAlternateEmail() {return alternateEmail;}
	
	//Get password
	public String getPassword() {return password;}
	
	//Return all the info of the object
	public String showInfo() {
		return "Display Name: " + firstName + " " +  lastName + 
				"\nCompany Email: " + email + 
				"\nMailbox Capacity: " + mailboxCapacity + "mb";		
	}
	
}	
