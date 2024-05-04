package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance =0;
	private static int costOfCourse=600;
	private static int id = 1000;
	
	// Constructor : prompt user to enter student's name & year
	public Student()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the student first name : ");
		this.firstName=sc.nextLine();
		
		System.out.print("Enter student last name :: ");
		this.lastName=sc.nextLine();
		
		System.out.print("1 - Freshmen \n 2 - Sophomore \n 3 - Junior \n 4 - Senior \n Enter student class level :");
		
		this.gradeYear = sc.nextInt();
		setStudentID();
		
		//System.out.println(firstName+ " "+ lastName +" "+gradeYear+" "+studentID);
		
	
	}
	
	
	// Generate an ID
	
	private void setStudentID()
	{
		//GradeLevel + ID
		id++;   // it increases as no of students gets added up
		
		this.studentID= gradeYear + ""+id;
	}
	

	
	// Enroll in courses
	
	public void enroll()
	{
		//Get inside a loop, user hits Q to quit
		do {
		System.out.print("Enter the course to enroll (Q to quit) : ");
		
		Scanner sc = new Scanner(System.in);
		String course = sc.nextLine();
		if(!course.equals("Q"))
		{
			courses = courses + "\n" + course;
			tuitionBalance = tuitionBalance + costOfCourse;
		}
		else
		{
			break;
		}
			
		}while(1!=0); // forever
		//System.out.println("Enrolled in : " + courses+" ");
		//System.out.println("Tuition Balance :" + tuitionBalance);
	}
	
	// View Balance
	public void viewBalance()
	{
		System.out.println("Your balance is : $"+ tuitionBalance);
	}
	
	// Pay Tuition
	
	public void payTuition()
	{
		viewBalance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your payment : ");
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for the payment of $ " +payment);
		viewBalance();
	}
	
	// Show status
	
	public String showInfo()
	{
		return "Name:" +firstName+" "+lastName + "\n Grade Level : " +gradeYear + "\n Student ID : "+studentID +
				"\n Courses Enrolled : "+ courses + "\n Balance is $: "+ tuitionBalance;
	}

}
