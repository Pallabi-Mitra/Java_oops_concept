package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		/*
		Student stu1 = new Student();
		stu1.enroll();
		stu1.payTuition();
		System.out.println(stu1.showInfo());
		
		
		
		Student stu2 = new Student();
		stu2.enroll();
		stu2.payTuition();
		System.out.println(stu2.showInfo());
		*/
		
		//Ask how many new users to add
		
		System.out.print("Enter the number of new students to enroll :");
		Scanner sc = new Scanner(System.in);
		int numOfStudents = sc.nextInt();
		Student [] students = new Student[numOfStudents]; // creating array of objects to take multiple inputs
		
		
		// create n no of new students
		
		
		for(int n = 0;n<numOfStudents;n++)
		{
			students[n]=new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].showInfo());
		}

	}

}
