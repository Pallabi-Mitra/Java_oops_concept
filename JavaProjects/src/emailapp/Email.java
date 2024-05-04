package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength=10;
	private String companySuffix = "aeycompany.com";
	
	
	// Constructor to receive the first name and last name
	
	public Email(String firstName, String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		//System.out.println("Email Created : "+this.firstName+" "+this.lastName);
		
		
		//Call a method asking for the department - return the department
		this.department=setDepartment();
		//System.out.println("Department: "+this.department);
		
		//Call a method that returns a random password
		
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Your password is : " + this.password);
		
		//Combining elements to generate email:
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.println("your email is : "+email);
	}
	
	// Ask for the department
	private String setDepartment()
	{
		System.out.print("New worker: " +firstName + " Department Codes :  \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none\nEnter Department Code : ");
		Scanner sc = new Scanner(System.in);
		int depchoice = sc.nextInt();
		if(depchoice ==1)
			return "sales";
		else if(depchoice ==2)
			return "dev";
		else if(depchoice==3)
			return "acc";
		else
			return "";
		
	}
	
	
	
	// Generate a random password
	
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890!@#$*";
		
		char[] password = new char[length];
		
		for( int i=0;i<length;i++)
		{
			int rand = (int)(Math.random() * passwordSet.length());
			password[i]=passwordSet.charAt(rand);
			
		}
		
		return new String(password);
	}
	
	
	// Set the mailbox capacity
	
	
	
		public void setMailboxCapacity(int capacity)
		{
			this.mailboxCapacity=capacity;
		}
	
	//Set the alternate email
		
		public void setAlternateEmail(String altEmail)
		{
			this.alternateEmail=altEmail;
		}
		
	
	//Change the password
		
		public void changePassword(String password)
		{
			this.password=password;
		}
		
		// Get Methods :
		
		public int getMailboxCapacity()
		{
			return mailboxCapacity;
		}
		
		public String getAlternateEmail()
		{
			return alternateEmail;
		}
		
		public String getPassword()
		{
			return password;
		}
		
		public String showInfo()
		{
			return "Display Name : " + firstName + " " + lastName + "\nCompany Email : " + email + "\nMailBox Capacity : "+mailboxCapacity + "MB";
		}
	
}
